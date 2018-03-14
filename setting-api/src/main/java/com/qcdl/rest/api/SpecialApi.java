package com.qcdl.rest.api;


import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.SpecialParam;
import com.qcdl.service.impl.SpecialServiceI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.restful.api.filter.authority.AuthType;
import org.restful.api.filter.authority.Authority;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/special")
@Api("专题管理")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@ApiResponses({@ApiResponse(code = 600, message = "登录状态失效")})
public class SpecialApi {
    @Autowired
    private SpecialServiceI specialService;

    /**
     * 分页查询专题列表
     *
     * @param pageParam 分页参数
     * @return
     */
    @POST
    @Path("/list")
    @ApiOperation(value = "查询专题列表")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public PageInfo<SettingSpecial> specialList(@ApiParam(value = "分页参数", required = true) PageParam pageParam) {
        return specialService.specialList(pageParam);
    }

    /**
     * 修改专题
     *
     * @param special 专题参数
     */
    @PUT
    @Path("/update")
    @ApiOperation(value = "查询专题列表")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void specialUpdate(@ApiParam(value = "专题参数", required = true) SettingSpecial special) {
        specialService.specialUpdate(special);
    }

    /**
     * 删除一条专题
     *
     * @param id 专题id
     */
    @DELETE
    @Path("/delete/{id}")
    @ApiOperation(value = "删除专题")
    @Authority(AuthType.不检查)
//    @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void specialDelete(@ApiParam(value = "专题id", required = true) @PathParam("id") Integer id) {
        specialService.specialDelete(id);
    }

    /**
     * @param special
     */
    @POST
    @Path("/add")
    @ApiOperation(value = "增加专题")
    @Authority(AuthType.不检查)
    //  @ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
    public void specialAdd(@ApiParam(value = "专题内容", required = true) SettingSpecial special) {
        specialService.specialAdd(special);
    }
}
