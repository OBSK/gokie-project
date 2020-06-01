package com.gokiesoft.rest.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.gokiesoft.rest.model.Category;
import com.gokiesoft.rest.model.Product;
import com.gokiesoft.rest.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductResolver implements GraphQLResolver<Product> {
    @Autowired
    private CategoryRepository categoryRepository;

    public ProductResolver(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category getCategory(Product product) {
        return categoryRepository.findById(product.getCategory().getId()).orElseThrow(null);
    }
}