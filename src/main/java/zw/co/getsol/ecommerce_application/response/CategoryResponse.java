package zw.co.getsol.ecommerce_application.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import zw.co.getsol.ecommerce_application.domain.Category;
@RequiredArgsConstructor
@Getter
public final class CategoryResponse {
    private final Category category;

}
