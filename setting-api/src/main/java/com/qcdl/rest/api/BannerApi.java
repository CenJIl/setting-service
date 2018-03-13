package com.qcdl.rest.api;


import com.github.pagehelper.PageInfo;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.BannerParam;
import com.qcdl.service.impl.BannerServiceI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.restful.api.filter.authority.AuthType;
import org.restful.api.filter.authority.Authority;
import org.springframework.beans.factory.annotation.Autowired;

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
     * @param id 广告id
     */
    @POST
    @Path("/update/{id}")
    @ApiOperation(value = "查询广告列表")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void bannerUpdate(@ApiParam(value = "id", required = true) @PathParam("id") Integer id, BannerParam bannerParam) {
        bannerService.bannerUpdate(id, bannerParam);
    }


}
