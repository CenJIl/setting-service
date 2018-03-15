package com.qcdl.rest.api;

import com.qcdl.model.entity.industry;
import com.qcdl.rest.param.industryParam;
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
 * Created by hxh on 2018/3/14.
 */
@Path("/industry")
@Api("行业")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
public class IndustryApi {

    @Autowired
    private IndustryServiceI classifyService;

    /**
     * 查询全部行业
     *
     * @return 所有行业
     */
    @POST
    @Path("/allList")
    @ApiOperation(value = "查询全部行业", notes = "管理员调用，权限code：industry")
    @Authority(AuthType.不检查)
    public List<industry> allList() {
        return classifyService.allList();
    }

    /**
     * 增加行业
     *
     * @param param 行业参数
     */
    @POST
    @Path("/add")
    @ApiOperation(value = "增加行业", notes = "管理员调用，权限code：industry")
    @Authority(AuthType.不检查)
    public void add(@ApiParam(value = "行业参数", required = true) industryParam param) {
        classifyService.add(param);
    }

    /**
     * 编辑行业信息
     *
     * @param param 行业参数
     */
    @PUT
    @Path("/update")
    @ApiOperation(value = "编辑行业信息", notes = "管理员调用，权限code：industry")
    @Authority(AuthType.不检查)
    public void update(@ApiParam(value = "行业参数", required = true) industryParam param) {
        classifyService.update(param);
    }

    /**
     * 删除行业
     *
     * @param id 行业ID
     */
    @DELETE
    @Path("/delete/{id}")
    @ApiOperation(value = "删除行业", notes = "管理员调用，权限code：industry")
    @Authority(AuthType.不检查)
    public void delete(@ApiParam(value = "行业id", required = true) @PathParam("id") Integer id) {
        classifyService.delete(id);
    }

}