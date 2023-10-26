package buuhq.quarkus.module.api;

import buuhq.quarkus.module.configuration.payloads.ResponseProducer;
import buuhq.quarkus.module.configuration.payloads.ResponseWrapper;
import buuhq.quarkus.module.infrastructure.persistence.entities.MyEntity;
import buuhq.quarkus.module.sample.application.port.in.SampleUseCase;
import buuhq.quarkus.module.sample.domain.models.MyEntityModel;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.Random;

@Path("/sample")
public class SampleApi {
    @Inject
    SampleUseCase useCase;

    @Path("/add-my-entity")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RestResponse<ResponseWrapper<Long>> add(MyEntityModel model) {
        //Random random = new Random();
        //var entity = new MyEntity("Test Add - " + random.nextInt());
        //return useCase.createMyEntity(entity);
        long myEntityId = useCase.createMyEntity(model);
        return ResponseProducer.ok(myEntityId);
    }
    @Path("/hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public RestResponse<ResponseWrapper<String>> hello() {
        return ResponseProducer.ok("Hello from RESTEasy Reactive");
    }
}
