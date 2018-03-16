package com.qcdl.rest.api;


import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.Admin;
import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.rest.param.SpecialPageParam;
import com.qcdl.rest.param.SpecialParam;
import com.qcdl.service.impl.SpecialServiceI;
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
 * @author 魏自东
 * @date 2018/3/16 9:51
 */
@Path("/special")
@Api("专题管理")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SpecialApi {
    @Autowired
    private SpecialServiceI specialService;

    @POST
    @Path("/list")
    @ApiOperation(value = "查询专题列表", notes = "管理员调用，权限code：special")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public PageInfo<SettingSpecial> list(@ApiParam(value = "分页参数", required = true) SpecialPageParam param) {
        return specialService.list(param);
    }

    @POST
    @Path("/get/{id}")
    @ApiOperation(value = "查询专题详情")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public SettingSpecial get(@ApiParam(value = "专题id", required = true) @PathParam("id") Integer id) {
        return specialService.get(id);
    }


    @PUT
    @Path("/update")
    @ApiOperation(value = "修改专题", notes = "管理员调用，权限code：special")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void update(@ApiParam(value = "专题参数", required = true) SpecialParam param) {
        specialService.update(param);
    }

    @DELETE
    @Path("/delete/{id}")
    @ApiOperation(value = "删除专题", notes = "管理员调用，权限code：special")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void delete(@ApiParam(value = "专题id", required = true) @PathParam("id") Integer id) {
        specialService.delete(id);
    }

    @POST
    @Path("/add")
    @ApiOperation(value = "增加专题", notes = "管理员调用，权限code：special")
    @Authority(AuthType.不检查)
    //  @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void add(@ApiParam(value = "专题参数", required = true) SpecialParam param, @Context HttpServletRequest request) {
        // TODO:后台管理上线后，需要修正
//        Admin a = SessionUtil.getUser(request, Admin.class);
        Admin a = new Admin();
        a.setId(0);
        specialService.add(a.getId(), param);
    }
}
