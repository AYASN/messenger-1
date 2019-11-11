package com.assir.yassine.messenger.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {

    @GET
    @Path("/annotations")
    public String getParamsUsingAnnotations(@MatrixParam("param") String matrixParam,
                                            @HeaderParam("authSessionID") String header,
                                            @CookieParam("JSESSIONID") String cookie) {
        return "Matrix param: " + matrixParam + ", header param: " + header +
                " and cookie: " + cookie;
    }
}