package buuhq.quarkus.module.sample.application.port.in;

import buuhq.quarkus.module.infrastructure.persistence.entities.MyEntity;
import buuhq.quarkus.module.sample.domain.models.MyEntityModel;

public interface SampleUseCase {
    long createMyEntity(MyEntityModel model);
}
