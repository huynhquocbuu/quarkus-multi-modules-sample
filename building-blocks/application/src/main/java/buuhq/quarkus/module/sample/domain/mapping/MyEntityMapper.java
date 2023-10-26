package buuhq.quarkus.module.sample.domain.mapping;

import buuhq.quarkus.module.infrastructure.persistence.entities.MyEntity;
import buuhq.quarkus.module.sample.domain.models.MyEntityModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "jakarta")
public interface MyEntityMapper {
    MyEntityMapper INSTANCE = Mappers.getMapper(MyEntityMapper.class);
    MyEntity toEntity(MyEntityModel model);
}
