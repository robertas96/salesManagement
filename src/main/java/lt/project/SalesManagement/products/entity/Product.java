package lt.project.SalesManagement.products.entity;

import lombok.Data;
import lt.project.SalesManagement.users.entity.Client;
import lt.project.SalesManagement.users.entity.Role;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "product_name")
    String productName;

    @Enumerated(value = EnumType.STRING)
    private Category category;

    @Column(name = "stock")
    BigDecimal stock;

    @Column(name = "cost_price")
    BigDecimal costPrice;

    @Column(name = "trade_price")
    BigDecimal tradePrice;

}
