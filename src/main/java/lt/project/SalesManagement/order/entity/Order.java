package lt.project.SalesManagement.order.entity;

import lombok.Data;
import lt.project.SalesManagement.invoice.entity.Invoice;
import lt.project.SalesManagement.users.entity.Client;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @Column(name = "order_date")
    LocalDateTime orderDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderProduct> orderProduct;

    @Column(name = "order_sum")
    BigDecimal orderSum;

    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;

    @ManyToMany
    @JoinColumn(name = "order")
    private List<Invoice> invoice;

}