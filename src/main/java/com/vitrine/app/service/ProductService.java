package com.vitrine.app.service;

import com.vitrine.app.exceptions.ProductNotFoundException;
import com.vitrine.app.model.Product;
import com.vitrine.app.repo.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProduct(Long id) {
        return repo.findById(id).orElseThrow(() ->
                new ProductNotFoundException("Product by id " + id + " was not found."));
    }

    public List<Product> addProduct(List<Product> products) {
        return repo.saveAll(products);
    }

    public Product updateProduct(Long id, Product product) {
        Product oldProduct = getProduct(id);

        oldProduct.setName(product.getName());
        oldProduct.setDescription(product.getDescription());
        oldProduct.setPrice(product.getPrice());
        oldProduct.setImage(product.getImage());

        return repo.save(oldProduct);
    }

    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }

    public List<Product> searchItems(String query) {
        List<Product> searchResults = repo.findByItemNameContainingIgnoreCase(query);
        return searchResults;
    }
}
