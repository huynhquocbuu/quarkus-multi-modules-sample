package buuhq.quarkus.module.infrastructure.persistence.entities;

import buuhq.quarkus.module.shared.enums.ERole;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @Enumerated(EnumType.STRING)
    private ERole id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    Set<User> users;
}
