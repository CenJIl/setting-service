package com.qcdl.rest.api;

import com.qcdl.model.entity.SettingArea;
import com.qcdl.rest.param.AreaParam;
import com.qcdl.service.impl.AreaServiceI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.restful.api.filter.authority.AuthType;
import org.restful.api.filter.authority.Authority;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

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

    @POST
    @Path("/list")
    @ApiOperation(value = "获取地区列表")
    @Authority(AuthType.不检查)
    //    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public List<SettingArea> list() {
        return areaService.list();
    }

    @GET
    @Path("/tree")
    @ApiOperation(value = "获取地区级联树")
    @Authority(AuthType.不检查)
    //    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public List<SettingArea> tree() {
        return areaService.tree();
    }

    @PUT
    @Path("/update")
    @ApiOperation(value = "编辑地区", notes = "管理员调用，权限code：area")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void update(@ApiParam(value = "地区参数", required = true) AreaParam param) {
        areaService.update(param);
    }

    @DELETE
    @Path("/delete/{id}")
    @ApiOperation(value = "删除地区", notes = "管理员调用，权限code：area")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void delete(@ApiParam(value = "地区id", required = true) @PathParam("id") Integer id) {
        areaService.delete(id);
    }

    @POST
    @Path("/add")
    @ApiOperation(value = "增加地区", notes = "管理员调用，权限code：area")
    @Authority(AuthType.不检查)
    //  @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void add(@ApiParam(value = "地区参数", required = true) AreaParam param) {
        areaService.add(param);
    }

}
