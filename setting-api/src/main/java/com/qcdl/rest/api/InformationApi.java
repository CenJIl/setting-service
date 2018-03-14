package com.qcdl.rest.api;

import io.swagger.annotations.Api;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author yuanhua
 * @date 2018/3/13
 */
@Path("/banner")
@Api("广告管理")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@ApiResponses({@ApiResponse(code = 600, message = "登录状态失效")})
public class InformationApi {

}
