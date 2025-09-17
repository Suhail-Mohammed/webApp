package com.example.webApp.service;

import com.example.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Samsong",70000),
            new Product(103,"Babluji",45000),
            new Product(104,"Android",2000)));
    public List<Product> getProducts() {
            return products;
    }

    public Product getProductById(int prodId) {
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().orElse(new Product(00 ,"Error Not Found" ,00));
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }





}
