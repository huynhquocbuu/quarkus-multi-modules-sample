package adapter.in;

import DTOs.SampleDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/sample")
public class SampleApi {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getSample(){
        var dto = new SampleDto("id-1", "name-1");
        return "Hello Sample Api " + dto.getName();
    }
}
