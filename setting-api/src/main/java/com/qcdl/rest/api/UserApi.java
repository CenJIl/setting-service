//package com.qcdl.rest.api;
//
//import com.qcdl.model.enums.LogType;
//import com.qcdl.rest.dto.LoginDto;
//import com.qcdl.rest.param.LoginParam;
//import com.qcdl.rest.param.PasswordParam;
//import io.swagger.annotations.*;
//import org.restful.api.filter.authority.AuthType;
//import org.restful.api.filter.authority.Authority;
//import org.restful.api.session.Session;
//import org.restful.api.session.SessionUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.wzd.framwork.utils.IPUtil;
//import org.wzd.framwork.utils.ThreadPoolUtil;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.ws.rs.*;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.MediaType;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * @author 魏自东
// * @date 2018/3/7 15:45
// */
//@Path("/user")
//@Api("用户")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
//public class UserApi {
//    @Autowired
//    private UserServiceI userService;
//    @Autowired
//    private PermissionServiceI menuService;
//    @Autowired
//    private UserLogServiceI logService;
//
//    @GET
//    @Path("/current")
//    @ApiOperation(value = "获取当前登陆的用户")
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
//    @ApiResponses({@ApiResponse(code = 600, message = "登录状态失效")})
//    public void current(@Context HttpServletRequest request) {
//        return SessionUtil.getUser(request, User.class);
//    }
//
//    @POST
//    @Path("/login")
//    @ApiOperation(value = "使用手机号码登录")
//    @Authority({AuthType.不检查})
//    @ApiResponses({@ApiResponse(code = 598, message = "参数错误"),
//            @ApiResponse(code = 903, message = "密码错误"),
//            @ApiResponse(code = 904, message = "手机号码未注册")})
//    public LoginDto<User> login(@ApiParam(value = "登录参数", required = true) LoginParam param,
//                                @Context HttpServletResponse response,
//                                @Context HttpServletRequest request) {
//        param.setIp(IPUtil.getIpAddress(request));
//        User u = userService.login(param);
//        String token = Session.generateToken(u.getId(), u.getLoginTime(), u.getAppType());
//        SessionUtil.save(response, token, u, u.getPermissions().stream().map(Permission::getCode).collect(Collectors.toList()));
//        return new LoginDto<>(token, u);
//    }
//
//    @GET
//    @Path("/getVerifyCode")
//    @ApiOperation(value = "获取验证码图片")
//    @Authority({AuthType.不检查})
//    public String getVerifyCode() {
//        return VerifyCodeUtils.outputImage(200, 80, 4);
//    }
//
//    @PUT
//    @Path("/changePassword")
//    @ApiOperation(value = "修改自己的密码")
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
//    @ApiResponses({@ApiResponse(code = 600, message = "登录状态失效")})
//    public void changePassword(@ApiParam(value = "修改密码参数", required = true) PasswordParam param,
//                               @Context HttpServletRequest request,
//                               @Context HttpServletResponse response) {
//        User u = SessionUtil.getUser(request, User.class);
//        userService.changePassword(u.getId(), param);
//        SessionUtil.delete(request, response);
//    }
//
//    @PUT
//    @Path("/logout")
//    @ApiOperation(value = "退出登录")
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
//    @ApiResponses({@ApiResponse(code = 600, message = "登录状态失效")})
//    public void logout(@Context HttpServletRequest request, @Context HttpServletResponse response) {
//        User u = SessionUtil.getUser(request, User.class);
//        SessionUtil.delete(request, response);
//        ThreadPoolUtil.execute(() -> logService.putLog(u.getId(), IPUtil.getIpAddress(request), LogType.登出日志, "退出成功!"));
//    }
//
//    @GET
//    @Path("/menu")
//    @ApiOperation(value = "获取当前登录的菜单")
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
//    @ApiResponses({@ApiResponse(code = 598, message = "参数错误"),
//            @ApiResponse(code = 600, message = "登录状态失效")})
//    public List<Permission> menu(@Context HttpServletRequest request) {
//        User u = SessionUtil.getUser(request, User.class);
//        return u.getPermissions();
//    }
//
//    @PUT
//    @Path("/edit")
//    @ApiOperation(value = "修改我的资料")
//    @ApiResponses({@ApiResponse(code = 600, message = "登录状态失效"), @ApiResponse(code = 900, message = "用户不存在")})
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
//    public void edit(@ApiParam(value = "修改的我的资料", required = true) User user, @Context HttpServletRequest request) {
//        User u = SessionUtil.getUser(request, User.class);
//        user.setId(u.getId());
//        userService.update(user);
//    }
//
//    @POST
//    @Path("/list")
//    @ApiOperation(value = "获取运营者列表", notes = "权限：user")
//    @Authority({"user"})
//    @ApiResponses({@ApiResponse(code = 600, message = "登录状态失效")})
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
//    public List<User> list(@Context HttpServletRequest request) {
//        User u = SessionUtil.getUser(request, User.class);
//        return userService.list(u.getMechanismId());
//    }
//
//    @GET
//    @Path("/get/{id}")
//    @ApiOperation(value = "获取用户详情", notes = "权限：user")
//    @Authority({"user"})
//    @ApiResponses({@ApiResponse(code = 598, message = "参数错误"), @ApiResponse(code = 600, message = "登录状态失效")})
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
//    public User get(@ApiParam(value = "用户ID", required = true) @PathParam("id") Integer id) {
//        return userService.getById(id);
//    }
//
//    @POST
//    @Path("/create")
//    @ApiOperation(value = "创建运营者", notes = "权限：user")
//    @Authority({"user"})
//    @ApiResponses({@ApiResponse(code = 598, message = "参数错误"), @ApiResponse(code = 600, message = "登录状态失效"), @ApiResponse(code = 901, message = "手机号码已经被占用")})
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
//    public User create(@ApiParam(value = "用户资料", required = true) User user, @Context HttpServletRequest request) {
//        User u = SessionUtil.getUser(request, User.class);
//        user.setMechanismId(u.getMechanismId());
//        return userService.create(user);
//    }
//
//    @DELETE
//    @Path("/del/{id}")
//    @ApiOperation(value = "删除运营者", notes = "权限：user")
//    @Authority({"user"})
//    @ApiResponses({@ApiResponse(code = 600, message = "登录状态失效"), @ApiResponse(code = 900, message = "用户不存在")})
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
//    public void del(@ApiParam(value = "用户id", required = true) @PathParam("id") Integer id) {
//        userService.del(id);
//    }
//
//    @PUT
//    @Path("/update")
//    @ApiOperation(value = "修改用户资料", notes = "权限：user")
//    @Authority({"user"})
//    @ApiResponses({@ApiResponse(code = 600, message = "登录状态失效"), @ApiResponse(code = 900, message = "用户不存在")})
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
//    public void updateAdmin(@ApiParam(value = "修改的用户资料", required = true) User user) {
//        userService.update(user);
//    }
//
//    @PUT
//    @Path("/toggle/{id}")
//    @ApiOperation(value = "启用、停用用户", notes = "权限：user")
//    @Authority({"user"})
//    @ApiResponses({@ApiResponse(code = 600, message = "登录状态失效"), @ApiResponse(code = 900, message = "用户不存在")})
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
//    public void toggleAdmin(@ApiParam(value = "用户ID", required = true) @PathParam("id") Integer id, @Context HttpServletRequest request) {
//        userService.toggle(id);
//    }


//}
