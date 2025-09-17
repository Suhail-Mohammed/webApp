package com.example.webApp.controller;

import com.example.webApp.model.Product;
import com.example.webApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service ;

    @GetMapping("/products")
    public List<Product> getProduct() {

         return service.getProducts();

}

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable  int prodId) {
        return service.getProductById(prodId);
    }


    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }






//@RequestMapping("/products/{prodId}")
//public Product getProductById(@PathVariable  int prodId) {
//        return service.getProductById(prodId);
//}


}
