package com.gokiesoft.rest.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gokiesoft.rest.model.Category;
import com.gokiesoft.rest.model.Product;
import com.gokiesoft.rest.repository.CategoryRepository;
import com.gokiesoft.rest.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    public Query(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public Iterable<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Iterable<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

}