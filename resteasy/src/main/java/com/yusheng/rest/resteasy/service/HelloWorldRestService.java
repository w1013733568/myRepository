package com.yusheng.rest.resteasy.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.alibaba.fastjson.JSON;

@Path("/hello")
public class HelloWorldRestService {

	@GET
	@Path("/{param}")
	@Produces("application/json") 
	public Response getName(@PathParam("param") String name) {
		
		String result = "RESTEasy Hello World : " + name;
		
		String jsonString = JSON.toJSONString(result);
		
		return Response.status(200).entity(jsonString).build();
	}
}