package com.mfinder.mlucard.wallet.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.mfinder.mlucard.wallet.domain.Notification;


@Service
@Path("/notification")
public class NotificationsResource {
	@GET
	@Path("/ping")
	public Response ping() throws Exception {
		return Response.ok().entity("Service online").build();
	}
	
	@GET
	@Path("/ping/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getNotification(@PathParam("id") int id) {
		
		System.out.println("hello world");
		return Response.ok().entity(new Notification(id, "test notification", "John")).build();
	}
	
	@POST
	@Path("/post/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postNotificcation(Notification notification) {
		return Response.status(201).entity(notification).build();
	}
}
