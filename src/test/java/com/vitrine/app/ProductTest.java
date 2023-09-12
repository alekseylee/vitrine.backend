//package com.vitrine.app;
//
//import com.vitrine.app.model.Product;
//import com.vitrine.app.repo.ProductRepository;
//import com.vitrine.app.service.ProductService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;
//
//public class ProductTest {
//    @InjectMocks
//    private ProductService productService;
//
//    @Mock
//    private ProductRepository productRepository;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testCreateProduct() {
//
//        List<Product> products = new ArrayList<>();
//        Product product1 = new Product("Product 1", "Description 1", 19.99);
//        Product product2 = new Product("Product 2", "Description 2", 29.99);
//        products.add(product1);
//        products.add(product2);
//
//
//        when(productRepository.saveAll(products)).thenReturn(products);
//
//        List<Product> savedProducts = productService.addProduct(products);
//
//        verify(productRepository, times(1)).saveAll(products);
//
//        assertEquals(products.size(), savedProducts.size());
//        assertEquals(products.get(0).getName(), savedProducts.get(0).getName());
//        assertEquals(products.get(1).getDescription(), savedProducts.get(1).getDescription());
//        assertEquals(products.get(0).getPrice(), savedProducts.get(0).getPrice());
//        assertEquals(products.get(1).getName(), savedProducts.get(1).getName());
//        assertEquals(products.get(1).getDescription(), savedProducts.get(1).getDescription());
//        assertEquals(products.get(1).getPrice(), savedProducts.get(1).getPrice());
//    }
//
//
//
//    @Test
//    public void testGetProductById() {
//        // Create a sample product
//        Product product = new Product("Sample Product", "Description", 19.99);
//        product.setId(1L);
//
//        // Mock the repository's findById method
//        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
//
//        // Call the service to get the product by ID
//        Product retrievedProduct = productService.getProduct(1L);
//
//        // Verify that the findById method was called with the correct ID
//        verify(productRepository, times(1)).findById(1L);
//
//        // Assert that the retrieved product matches the expected product
//        assertEquals(product.getId(), retrievedProduct.getId());
//        assertEquals(product.getName(), retrievedProduct.getName());
//        assertEquals(product.getDescription(), retrievedProduct.getDescription());
//        assertEquals(product.getPrice(), retrievedProduct.getPrice());
//    }
//
//}
//
