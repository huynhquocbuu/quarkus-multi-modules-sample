package buuhq.quarkus.module.infrastructure.persistence.entities;

import buuhq.quarkus.module.shared.enums.EAuthType;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Set;

@Entity
@Table(name = "users")
@Getter
public class User {
    @Id
    @Column(length = 100)
    private String id;

    @Column(length = 10, name = "auth_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private EAuthType authType;
    @Column(length = 100, unique = true , name = "user_name", nullable = false)
    private String username;

    @Column(length = 200, name = "full_name", nullable = false)
    private String fullName;

    @Column(length = 100)
    private String email;
    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    Set<Role> roles;
}
