package lt.project.SalesManagement.order.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lt.project.SalesManagement.products.entity.Product;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "orderProduct")
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderProduct_id")
    private Long id;

    @Column(name = "product_name")
    String productName;

    @NotNull
    BigDecimal quantity;

    @NotNull
    BigDecimal price;

    @NotNull
    BigDecimal totalPrice;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;


}
