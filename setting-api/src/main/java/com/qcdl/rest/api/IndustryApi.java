package com.qcdl.rest.api;

import com.qcdl.model.entity.Industry;
import com.qcdl.rest.param.IndustryParam;
import com.qcdl.service.impl.IndustryServiceI;
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
 * @author 魏自东
 * @date 2018/3/16 10:56
 */
@Path("/industry")
@Api("行业")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
public class IndustryApi {
    @Autowired
    private IndustryServiceI classifyService;

    @POST
    @Path("/list")
    @ApiOperation(value = "查询全部行业")
    @Authority(AuthType.不检查)
    public List<Industry> list() {
        return classifyService.list();
    }

    @POST
    @Path("/tree")
    @ApiOperation(value = "获取行业树")
    @Authority(AuthType.不检查)
    public List<Industry> tree() {
        return classifyService.tree();
    }

    @POST
    @Path("/add")
    @ApiOperation(value = "增加行业", notes = "管理员调用，权限code：industry")
    @Authority(AuthType.不检查)
    public void add(@ApiParam(value = "行业参数", required = true) IndustryParam param) {
        classifyService.add(param);
    }

    @PUT
    @Path("/update")
    @ApiOperation(value = "编辑行业信息", notes = "管理员调用，权限code：industry")
    @Authority(AuthType.不检查)
    public void update(@ApiParam(value = "行业参数", required = true) IndustryParam param) {
        classifyService.update(param);
    }

    @DELETE
    @Path("/delete/{id}")
    @ApiOperation(value = "删除行业", notes = "管理员调用，权限code：industry")
    @Authority(AuthType.不检查)
    public void delete(@ApiParam(value = "行业id", required = true) @PathParam("id") Integer id) {
        classifyService.delete(id);
    }

}