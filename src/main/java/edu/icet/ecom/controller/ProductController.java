package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    List<Product> getProducts() {
        ProductService service = new ProductService();
        return service.getProducts();
    }
}
