package com.vitrine.app.repo;

import com.vitrine.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    void deleteById(Long id);
    Optional<Product> findById (Long id);
    void updateProduct(String name, String description, double price);
}
