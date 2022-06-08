package zw.co.getsol.ecommerce_application.dto;

import lombok.RequiredArgsConstructor;
import zw.co.getsol.ecommerce_application.domain.Category;
@RequiredArgsConstructor
public class CategoryDto {
    private String name;
    private String description;

    public static CategoryDto of (Category category){
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.name = category.getName();
        categoryDto.description = category.getDescription();
        return categoryDto;
    }
}
