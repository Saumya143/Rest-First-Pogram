package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
@Path("/greet")
public class GreetResource {
	public GreetResource() {
		System.out.println("GreetResource.GreetResource()");
	}
	
	@GET
	
	public Response greateSource() {
		String msg="GOOD MORNING";
		return Response.ok(msg).build();
	}

}
