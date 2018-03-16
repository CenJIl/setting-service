package com.qcdl.rest.api;


import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.Admin;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.rest.param.BannerPageParam;
import com.qcdl.rest.param.BannerParam;
import com.qcdl.service.impl.BannerServiceI;
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
 * @date 2018/3/12
 */
@Path("/banner")
@Api("广告")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BannerApi {
    @Autowired
    private BannerServiceI bannerService;

    @POST
    @Path("/list")
    @ApiOperation(value = "获取广告列表")
    @Authority(AuthType.不检查)
    public PageInfo<SettingBanner> list(@ApiParam(value = "广告列表分页查询参数", required = true) BannerPageParam param) {
        return bannerService.list(param);
    }

    @PUT
    @Path("/update")
    @ApiOperation(value = "编辑广告", notes = "管理员调用，权限code：banner")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void update(@ApiParam(value = "广告参数", required = true) BannerParam banner) {
        bannerService.update(banner);
    }

    @DELETE
    @Path("/delete/{id}")
    @ApiOperation(value = "删除广告", notes = "管理员调用，权限code：banner")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void delete(@ApiParam(value = "广告id", required = true) @PathParam("id") Integer id) {
        bannerService.delete(id);
    }

    @POST
    @Path("/add")
    @ApiOperation(value = "增加广告", notes = "管理员调用，权限code：banner")
    @Authority(AuthType.不检查)
    //  @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void add(@ApiParam(value = "广告参数", required = true) BannerParam param, @Context HttpServletRequest request) {
        // TODO：后台上线后，该注释需要解开
//        Admin a = SessionUtil.getUser(request, Admin.class);
        Admin a = new Admin();
        param.setAdminId(a.getId());
        bannerService.add(param);
    }

    @GET
    @Path("/get/{id}")
    @ApiOperation(value = "获取广告详情", notes = "管理员调用，权限code：banner")
    @Authority(AuthType.不检查)
    //  @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public SettingBanner get(@ApiParam(value = "广告ID", required = true) @PathParam("id") Integer id) {
        return bannerService.get(id);
    }

}



