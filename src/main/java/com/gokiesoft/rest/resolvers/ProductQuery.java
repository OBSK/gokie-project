package com.gokiesoft.rest.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gokiesoft.rest.model.Category;
import com.gokiesoft.rest.model.Product;
import com.gokiesoft.rest.repository.ProductRepository;

public class ProductQuery implements GraphQLQueryResolver {
    private ProductRepository productRepository;
    private Category category;

    public ProductQuery(ProductRepository productRepository, Category category) {
        this.productRepository = productRepository;
        this.category = category;
    }

    public List<Product> obtenerProductos() {
        return productRepository.findAll();
    }
}