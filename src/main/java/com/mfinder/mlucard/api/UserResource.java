
package com.mfinder.mlucard.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

/**
 * @author thein
 * @createdAt Apr 5, 2019
 */
@Service
@Path("/notification")
public class UserResource {
	@GET
	@Path("/ping")
	public Response ping() throws Exception {
		return Response.ok().entity("Service online").build();
	}
}
