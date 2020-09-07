package lt.project.SalesManagement.users.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;


@Data
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Enumerated
    @NaturalId
    private RoleName role;

    public Role() {
    }

    public Role(RoleName role) {
        this.role = role;
    }
}
