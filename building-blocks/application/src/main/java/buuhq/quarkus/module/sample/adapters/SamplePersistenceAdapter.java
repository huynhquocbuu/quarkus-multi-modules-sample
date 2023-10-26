package buuhq.quarkus.module.sample.adapters;

import buuhq.quarkus.module.infrastructure.persistence.entities.MyEntity;
import buuhq.quarkus.module.infrastructure.persistence.repositories.MyEntityRepository;
import buuhq.quarkus.module.sample.application.port.out.SamplePersistencePort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class SamplePersistenceAdapter implements SamplePersistencePort {
    @Inject
    MyEntityRepository repository;
    @Override
    public MyEntity insertMyEntity(MyEntity entity) {
        return repository.add(entity);
    }
}
