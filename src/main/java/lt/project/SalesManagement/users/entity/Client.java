package lt.project.SalesManagement.users.entity;

import lombok.Data;
import lt.project.SalesManagement.invoice.entity.Invoice;
import lt.project.SalesManagement.order.entity.Order;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String clientCode;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private Long bankAccount;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Order> ordersList;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Invoice> invoicesList;

    @ManyToMany
    @JoinTable(
            name = "clients_roles",
            joinColumns = {@JoinColumn(name = "client_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles;


}
