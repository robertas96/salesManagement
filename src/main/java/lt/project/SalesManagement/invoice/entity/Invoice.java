package lt.project.SalesManagement.invoice.entity;

import lombok.Data;
import lt.project.SalesManagement.order.entity.Order;
import lt.project.SalesManagement.users.entity.Client;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "invoices")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Long id;

    @Column(name = "invoice_date")
    LocalDateTime invoiceDate;

    @ManyToMany
    @JoinColumn(name = "invoice", updatable = false)
    private List<Order> order;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(name = "invoice_sum")
    BigDecimal invoiceSum;

    @Column(name = "payment_term")
    LocalDateTime paymentTerm;
}
