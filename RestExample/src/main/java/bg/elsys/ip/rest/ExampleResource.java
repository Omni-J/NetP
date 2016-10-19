package bg.elsys.ip.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class ExampleResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayhello() {
		return Response.ok(new User(1, "admin")).build();
	}
}
