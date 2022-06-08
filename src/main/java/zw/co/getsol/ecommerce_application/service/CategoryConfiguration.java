package zw.co.getsol.ecommerce_application.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zw.co.getsol.ecommerce_application.repository.CategoryRepository;

@Configuration
public class CategoryConfiguration {

    @Bean
    public CreateCategoryService createCategoryService(CategoryRepository categoryRepository){
        return new CreateCategoryServiceImpl(categoryRepository);
    }
}
