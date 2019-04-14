package id.nap.test.ikan.endpoint;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import id.nap.test.ikan.model.Cobaan;

@Path("sayHello")
public class TestEndpoint {
	
	@GET
	@Path("xml")
	@Produces(MediaType.APPLICATION_XML)
	public Response sayHelloInXML() {
		return Response.status(Response.Status.OK).entity(new Cobaan("Hello, World!")).build();
	}
	
	@GET
	@Path("json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHelloInJson() {
		return Response.status(Response.Status.OK).entity(new Cobaan("Hello, World!")).build();
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteHello() {
		return Response.status(Response.Status.OK).entity(new Cobaan("Delete, World!")).build();
		
	}
}
