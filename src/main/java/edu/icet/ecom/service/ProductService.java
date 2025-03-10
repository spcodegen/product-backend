package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

     public List<Product> getProducts(){
         //create an object three type
         //step 01
         Product prd1 = new Product();
         prd1.setName("Apple");
         prd1.setDescription("A fruit");
         prd1.setPrice(25.50);
         //step 02
         Product prd2 = new Product("Orange", "a fruit", 35.75);
         //step 03
         Product prd3 = Product.builder().name("Banana").description("yellow color fruit").price(15.25).build();

         return Arrays.asList(prd1, prd2, prd3);
     }
}
