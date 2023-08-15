//package com.vitrine.app.controller;
//
//import com.vitrine.app.model.Product;
//import com.vitrine.app.repo.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/products")
//public class ProductController {
//
//    private final ProductRepository productRepository;
//
//    @Autowired
//    public ProductController(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @GetMapping
//    public List<Product> getProducts() {
//        return productRepository.findAll();
//    }
//}