package zw.co.getsol.ecommerce_application.service;

import zw.co.getsol.ecommerce_application.domain.Category;
import zw.co.getsol.ecommerce_application.dto.CategoryCreateRequest;
import zw.co.getsol.ecommerce_application.repository.CategoryRepository;
import zw.co.getsol.ecommerce_application.response.CategoryResponse;

public class CreateCategoryServiceImpl implements CreateCategoryService{
    private final CategoryRepository categoryRepository;

    public CreateCategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryResponse create(CategoryCreateRequest categoryCreateRequest) {
        Category category = new Category();
        category.setDescription(categoryCreateRequest.getDescription());
        category.setName(categoryCreateRequest.getName());
        categoryRepository.save(category);
        return new CategoryResponse(category);
    }
}
