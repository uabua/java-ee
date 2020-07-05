package mariami.chakhvadze.bookstore.repository;

import mariami.chakhvadze.bookstore.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository <Tag, Long> {
}
