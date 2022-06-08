package zw.co.getsol.ecommerce_application.service;

import zw.co.getsol.ecommerce_application.repository.CategoryRepository;
import zw.co.getsol.ecommerce_application.repository.ProductRepository;

public class CreateProductServiceImpl {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public CreateProductServiceImpl(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }
}
