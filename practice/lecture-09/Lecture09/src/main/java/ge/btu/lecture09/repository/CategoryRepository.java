package ge.btu.lecture09.repository;

import ge.btu.lecture09.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
