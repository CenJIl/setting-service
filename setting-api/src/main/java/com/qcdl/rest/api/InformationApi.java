package com.qcdl.rest.api;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.InformationParam;
import com.qcdl.service.impl.InformationServicel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.restful.api.filter.authority.AuthType;
import org.restful.api.filter.authority.Authority;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by hxh on 2018/3/14.
 */
@Path("/information")
@Api("案例管理")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InformationApi {

    @Autowired
    private InformationServicel informationService;

    /**
     * @param pageParam
     * @return
     */
    @POST
    @Path("/list")
    @ApiOperation(value = "查询案例列表")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public PageInfo<InformationParam> informationList(@ApiParam(value = "分页参数", required = true) PageParam pageParam) {
        return informationService.informationlist(pageParam);
    }

    /**
     *
     * @param information
     */
    @PUT
    @Path("/update")
    @ApiOperation(value = "修改案例")
    @Authority(AuthType.不检查)
    //    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void informationUpdate(@ApiParam(value = "案例参数", required = true) SettingInformation information) {
        informationService.informationUpdate(information);
    }

    /**
     *
     * @param id
     */
    @DELETE
    @Path("/delete/{id}")
    @ApiOperation(value = "删除案例")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "que")})
    public void informationDelete(@ApiParam(value = "案例id",required = true)@PathParam("id")Integer id){
        informationService.informationDelete(id);
    }

    @POST
    @Path("/add")
    @ApiOperation(value = "增加案例")
    @Authority(AuthType.不检查)
    //  @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void Add(@ApiParam(value = "广告内容", required = true) SettingInformation information) {
        informationService.informationAdd(information);
    }
}
