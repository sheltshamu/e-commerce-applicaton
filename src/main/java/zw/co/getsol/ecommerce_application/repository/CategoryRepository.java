package zw.co.getsol.ecommerce_application.repository;

import org.springframework.stereotype.Repository;
import zw.co.getsol.ecommerce_application.domain.Category;

import java.util.Optional;

@Repository
public interface CategoryRepository extends BaseRepository<Category> {
   Optional<Category> findByName(String name);
}
