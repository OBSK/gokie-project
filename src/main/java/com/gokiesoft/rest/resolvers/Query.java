package com.gokiesoft.rest.resolvers;

import java.util.List;
import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gokiesoft.rest.model.Category;
import com.gokiesoft.rest.model.Product;
import com.gokiesoft.rest.model.SaleItem;
import com.gokiesoft.rest.repository.CategoryRepository;
import com.gokiesoft.rest.repository.ProductRepository;
import com.gokiesoft.rest.repository.SaleItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    private SaleItemRepository saleItemRepository;

    @Autowired
    public Query(ProductRepository productRepository, CategoryRepository categoryRepository, SaleItemRepository saleItemRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.saleItemRepository = saleItemRepository;
    }

    public Iterable<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Iterable<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<SaleItem> findAllSalesItemById(Long id) {
        return saleItemRepository.findById(id);
    }
}