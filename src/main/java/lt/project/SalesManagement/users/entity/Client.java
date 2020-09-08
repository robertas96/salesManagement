package lt.project.SalesManagement.users.entity;

import lombok.Data;
import lt.project.SalesManagement.invoice.entity.Invoice;
import lt.project.SalesManagement.order.entity.Order;

import javax.persistence.*;
import java.util.List;

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
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Order> ordersList;

    @OneToMany(mappedBy = "client")
    private List<Invoice> invoicesList;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "client")
    private User user;
}
