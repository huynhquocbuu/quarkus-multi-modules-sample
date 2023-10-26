package buuhq.quarkus.module.sample.application.service;

import buuhq.quarkus.module.sample.application.port.in.SampleUseCase;
import buuhq.quarkus.module.sample.application.port.out.SamplePersistencePort;
import buuhq.quarkus.module.sample.domain.mapping.MyEntityMapper;
import buuhq.quarkus.module.sample.domain.models.MyEntityModel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SampleService implements SampleUseCase {
    @Inject
    MyEntityMapper mapper;
    @Inject
    SamplePersistencePort persistencePort;
    @Override
    public long createMyEntity(MyEntityModel model) {
        var entity =  mapper.toEntity(model);
        entity = persistencePort.insertMyEntity(entity);

        return entity.getId();
    }
}
