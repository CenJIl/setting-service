package com.qcdl.rest.api;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingAarea;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.rest.param.AreaPageParam;
import com.qcdl.rest.param.BannerParam;
import com.qcdl.service.impl.AreaServiceI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.restful.api.filter.authority.AuthType;
import org.restful.api.filter.authority.Authority;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * @author yuanhua
 * @date 2018/3/15
 */
@Path("/area")
@Api("地区")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AreaApi {
    @Autowired
    private AreaServiceI areaService;

    /**
     * 获取地区列表
     *
     * @param param 分页参数
     * @return 广告列表
     */
    @POST
    @Path("/list")
    @ApiOperation(value = "获取地区列表", notes = "管理员调用，权限code：area")
    @Authority(AuthType.不检查)
    public PageInfo<SettingAarea> list(@ApiParam(value = "地区分页查询参数", required = true) AreaPageParam param) {
        return areaService.list(param);
    }

    /**
     * 编辑地区信息
     *
     * @param banner 地区参数
     */
    @PUT
    @Path("/update")
    @ApiOperation(value = "编辑地区", notes = "管理员调用，权限code：area")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void update(@ApiParam(value = "广告参数", required = true) BannerParam banner) {
        areaService.update(banner);
    }

    /**
     * 根据id删除地区
     *
     * @param id 地区id
     */
    @DELETE
    @Path("/delete/{id}")
    @ApiOperation(value = "删除地区", notes = "管理员调用，权限code：area")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void delete(@ApiParam(value = "地区id", required = true) @PathParam("id") Integer id) {
        areaService.delete(id);
    }

    /**
     * 增加一条地区
     *
     * @param param   地区参数
     * @param request 缓存
     */
    @POST
    @Path("/add")
    @ApiOperation(value = "增加地区", notes = "管理员调用，权限code：area")
    @Authority(AuthType.不检查)
    //  @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void add(@ApiParam(value = "地区参数", required = true) BannerParam param, @Context HttpServletRequest request) {
        // TODO：后台上线后，该注释需要解开
//        Admin a = SessionUtil.getUser(request, Admin.class);
//        param.setAdminId(a.getId());
        areaService.add(param);
    }

    /**
     * 获取地区详情
     *
     * @param id 地区id
     * @return 地区详情
     */
    @GET
    @Path("/get/{id}")
    @ApiOperation(value = "获取地区详情", notes = "管理员调用，权限code：area")
    @Authority(AuthType.不检查)
    //  @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public SettingBanner get(@ApiParam(value = "地区ID", required = true) @PathParam("id") Integer id) {
        return areaService.get(id);
    }
}
