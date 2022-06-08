package zw.co.getsol.ecommerce_application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zw.co.getsol.ecommerce_application.common.ApiResponse;
import zw.co.getsol.ecommerce_application.dto.CategoryCreateRequest;
import zw.co.getsol.ecommerce_application.dto.CategoryDto;
import zw.co.getsol.ecommerce_application.response.CategoryResponse;
import zw.co.getsol.ecommerce_application.service.CreateCategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CreateCategoryService createCategoryService;

    public CategoryController(CreateCategoryService createCategoryService) {
        this.createCategoryService = createCategoryService;
    }

    @PostMapping("/")
    public ApiResponse<CategoryDto> create(@RequestBody CategoryCreateRequest categoryCreateRequest){
        CategoryResponse categoryResponse = createCategoryService.create(categoryCreateRequest);
        return new ApiResponse<>(CategoryDto.of(categoryResponse.getCategory()),"Successfully Created", HttpStatus.OK);
    }

}
