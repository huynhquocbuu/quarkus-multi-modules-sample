package buuhq.quarkus.module.infrastructure.persistence.repositories;

import buuhq.quarkus.module.infrastructure.persistence.entities.MyEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.List;

@ApplicationScoped
public class MyEntityRepository {
    @Inject
    EntityManager em;

    public List<MyEntity> getAll(){

        return em.createQuery("FROM MyEntity").getResultList();
    }

    public MyEntity add(MyEntity entity){
        em.persist(entity);
        em.flush();
        return entity;
    }
}
