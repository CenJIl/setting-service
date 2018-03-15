package com.qcdl.rest.api;


import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.rest.param.SpecialParam;
import com.qcdl.rest.param.specialPageParam;
import com.qcdl.service.impl.SpecialServiceI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.restful.api.filter.authority.AuthType;
import org.restful.api.filter.authority.Authority;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/special")
@Api("专题管理")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@ApiResponses({@ApiResponse(code = 600, message = "登录状态失效")})
public class SpecialApi {
    @Autowired
    private SpecialServiceI specialService;

    /**
     * 分页查询专题列表
     *
     * @param param 分页参数
     * @return 专题列表(分页)
     */
    @POST
    @Path("/list")
    @ApiOperation(value = "查询专题列表", notes = "管理员调用，权限code：special")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public PageInfo<SettingSpecial> list(@ApiParam(value = "分页参数", required = true) specialPageParam param) {
        return specialService.list(param);
    }

    /**
     * 修改专题
     *
     * @param param 专题参数
     */
    @PUT
    @Path("/update")
    @ApiOperation(value = "查询专题列表", notes = "管理员调用，权限code：special")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void update(@ApiParam(value = "专题参数", required = true) SpecialParam param) {
        specialService.update(param);
    }

    /**
     * 删除一条专题
     *
     * @param id 专题id
     */
    @DELETE
    @Path("/delete/{id}")
    @ApiOperation(value = "删除专题", notes = "管理员调用，权限code：special")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void delete(@ApiParam(value = "专题id", required = true) @PathParam("id") Integer id) {
        specialService.delete(id);
    }

    /**
     * 增加专题
     *
     * @param param 专题参数
     */
    @POST
    @Path("/add")
    @ApiOperation(value = "增加专题", notes = "管理员调用，权限code：special")
    @Authority(AuthType.不检查)
    //  @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void add(@ApiParam(value = "专题参数", required = true) SpecialParam param) {
        specialService.add(param);
    }
}
