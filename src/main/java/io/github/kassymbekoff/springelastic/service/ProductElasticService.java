package io.github.kassymbekoff.springelastic.service;

import io.github.kassymbekoff.springelastic.model.Product;
import io.github.kassymbekoff.springelastic.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductElasticService {

    @Autowired
    private ProductRepository productRepository;

    public void createProductIndexBulk(final List<Product> products){
        productRepository.saveAll(products);
    }

    public void createProductIndex(final Product product){
        productRepository.save(product);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "2");
    }
}
