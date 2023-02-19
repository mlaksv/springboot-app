package com.shopping.inventory;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class ProductService {
    @Autowired
    private ProductRepository prodRepo;
    public Product createProduct(Product product){

        Product createdProduct = prodRepo.save(product);
        return createdProduct;
    }
}
