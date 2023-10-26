package buuhq.quarkus.module.sample.application.port.out;

import buuhq.quarkus.module.infrastructure.persistence.entities.MyEntity;

public interface SamplePersistencePort {
    MyEntity insertMyEntity(MyEntity entity);
}
