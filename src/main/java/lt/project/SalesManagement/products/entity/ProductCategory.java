package lt.project.SalesManagement.products.entity;

import lombok.Data;
import lt.project.SalesManagement.order.entity.Order;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "categories")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Column(name = "category_name")
    String category;
}
