
package com.mfinder.mlucard.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author thein
 * @createdAt Apr 5, 2019
 */
@Component
@Scope("singleton")
@Path("/users")
public class UserResource {
	@GET
	@Path("/ping")
	public Response ping() throws Exception {
		return Response.ok().entity("Service online").build();
	}
}
