package lt.project.SalesManagement.products.controllers;

import lt.project.SalesManagement.products.entity.Product;
import lt.project.SalesManagement.products.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/public/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProduct(){
        List<Product> productList = productService.getProducts();
        return productList;
    }
}
