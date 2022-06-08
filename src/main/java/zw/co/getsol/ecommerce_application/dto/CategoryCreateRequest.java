package zw.co.getsol.ecommerce_application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryCreateRequest {
    private String name;
    private String description;
}
