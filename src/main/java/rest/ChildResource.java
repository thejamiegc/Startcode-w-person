package rest;

import javax.ws.rs.*;

@Path("/child")
public class ChildResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World from Child";
    }
}