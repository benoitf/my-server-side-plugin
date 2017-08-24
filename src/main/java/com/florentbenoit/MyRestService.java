package com.florentbenoit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @author Florent Benoit
 */
@Path("/customplugin")
public class MyRestService {

  @GET
  @Path("/hello/{name}")
  public Response hello(@PathParam("name") String name) {
    return Response.ok("good morning " + name + ", how are you ?").build();
  }


}

