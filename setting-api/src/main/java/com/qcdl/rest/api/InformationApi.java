package com.qcdl.rest.api;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.rest.param.InformationPageParam;
import com.qcdl.rest.param.InformationParam;
import com.qcdl.service.impl.InformationServiceI;
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
 * @date 2018/3/14
 */
@Path("/information")
@Api("案例管理")
//@ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InformationApi {

    @Autowired
    private InformationServiceI informationService;

    /**
     * 查询案例列表(分页)
     *
     * @param param 分页参数
     * @return 案例列表(分页)
     */
    @POST
    @Path("/list")
    @ApiOperation(value = "查询案例列表(分页)", notes = "管理员调用，权限code：information")
    @Authority(AuthType.不检查)
    public PageInfo<InformationParam> list(@ApiParam(value = "分页参数", required = true) InformationPageParam param) {
        return informationService.list(param);
    }

    /**
     * 查询案例详情
     *
     * @param id 案例id
     * @return 案例详情
     */
    @GET
    @Path("/getId/{id}")
    @ApiOperation(value = "查询案例详情", notes = "管理员调用，权限code：information")
    @Authority(AuthType.不检查)
    public SettingInformation list(@ApiParam(value = "分页参数", required = true) @PathParam("id") Integer id) {
        return informationService.getId(id);
    }

    /**
     * 添加案例
     *
     * @param param 案例参数
     */
    @POST
    @Path("/add")
    @ApiOperation(value = "添加案例", notes = "管理员调用，权限code：information")
    @Authority(AuthType.不检查)
    public void add(@ApiParam(value = "广告内容", required = true) InformationParam param) {
        informationService.add(param);
    }

    /**
     * 修改案例信息
     *
     * @param param 案例参数
     */
    @PUT
    @Path("/update")
    @ApiOperation(value = "修改案例", notes = "管理员调用，权限code：information")
    @Authority(AuthType.不检查)
    public void update(@ApiParam(value = "案例参数", required = true) InformationParam param) {
        informationService.update(param);
    }

    /**
     * 删除一个案例
     *
     * @param id 案例id
     */
    @DELETE
    @Path("/delete/{id}")
    @ApiOperation(value = "删除案例", notes = "管理员调用，权限code：information")
    @Authority(AuthType.不检查)
    public void delete(@ApiParam(value = "案例id", required = true) @PathParam("id") Integer id) {
        informationService.delete(id);
    }


}
