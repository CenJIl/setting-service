package com.qcdl.rest.api;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.BannerParam;
import com.qcdl.service.impl.BannerServiceI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.restful.api.filter.authority.AuthType;
import org.restful.api.filter.authority.Authority;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author yuanhua
 * @date 2018/3/12
 */
@Path("/banner")
@Api("广告管理")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@ApiResponses({@ApiResponse(code = 600, message = "登录状态失效")})
public class BannerApi {

    @Autowired
    private BannerServiceI bannerService;

    /**
     * 分页查询广告列表
     *
     * @param pageParam 分页参数
     * @return
     */
    @POST
    @Path("/list")
    @ApiOperation(value = "查询广告列表")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public PageInfo<BannerParam> bannerList(@ApiParam(value = "分页参数", required = true) PageParam pageParam) {
        return bannerService.bannerList(pageParam);
    }

    /**
     * 修改广告
     *
     * @param banner 广告参数
     */
    @PUT
    @Path("/update")
    @ApiOperation(value = "查询广告列表")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void bannerUpdate(@ApiParam(value = "广告参数", required = true) SettingBanner banner) {
        bannerService.bannerUpdate(banner);
    }

    /**
     * 删除一条广告
     *
     * @param id 广告id
     */
    @DELETE
    @Path("/delete/{id}")
    @ApiOperation(value = "删除广告")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void bannerDelete(@ApiParam(value = "广告id", required = true) @PathParam("id") Integer id) {
        bannerService.bannerDelete(id);
    }

    /**
     * @param banner
     */
    @POST
    @Path("/add")
    @ApiOperation(value = "增加广告")
    @Authority(AuthType.不检查)
    //  @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void bannerAdd(@ApiParam(value = "广告内容", required = true) SettingBanner banner) {
        bannerService.bannerAdd(banner);
    }
}



