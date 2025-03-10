package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    final ProductService service;

    @GetMapping("/product/all")
    List<Product> getProducts() {
        return service.getProducts();
    }

    @PostMapping("/product/add")
    void createProduct(){

    }

    @DeleteMapping("/product/delete")
    void deleteProduct(){

    }

    void updateProduct(){

    }

    void filterProdcutsByCategory(){

    }

    void deactiveProduct(){

    }
}
