package zw.co.getsol.ecommerce_application.repository;

import org.springframework.stereotype.Repository;
import zw.co.getsol.ecommerce_application.domain.Category;

@Repository
public interface CategoryRepository extends BaseRepository<Category> {
    //findbyname
}
