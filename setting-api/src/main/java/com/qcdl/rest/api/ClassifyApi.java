package com.qcdl.rest.api;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.Classify;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.model.param.PageParam;
import com.qcdl.service.impl.ClassifyServiceI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.restful.api.filter.authority.AuthType;
import org.restful.api.filter.authority.Authority;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by hxh on 2018/3/14.
 */
@Path("/classify")
@Api("案例分类")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
public class ClassifyApi {

    @Autowired
    private ClassifyServiceI classifyService;

    @POST
    @Path("/list")
    @ApiOperation(value = "分类列表")
    @Authority(AuthType.不检查)
    public PageInfo<Classify> classifyList(@ApiParam(value = "分页", required = true) PageParam pageParam) {
        return classifyService.classifyList(pageParam);
    }

    @POST
    @Path("/add")
    @ApiOperation(value = "增加案例")
    @Authority(AuthType.不检查)
    public void classifyCreate(@ApiParam(value = "分类参数", required = true) Classify classify) {
        classifyService.classifyCreate(classify);
    }


}