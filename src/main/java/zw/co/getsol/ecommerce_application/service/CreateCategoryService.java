package zw.co.getsol.ecommerce_application.service;

import zw.co.getsol.ecommerce_application.dto.CategoryCreateRequest;
import zw.co.getsol.ecommerce_application.response.CategoryResponse;

public interface CreateCategoryService {
    CategoryResponse create(CategoryCreateRequest CategoryCreateRequest);


    /*
    Create
Update
List all categories
     */


    /*
    {
  "categoryName": "watches",
  "description": "best watches",
  "imageUrl": "https://images.unsplash.com/photo-1524805444758-089113d48a6d?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80"
}
     */
}
