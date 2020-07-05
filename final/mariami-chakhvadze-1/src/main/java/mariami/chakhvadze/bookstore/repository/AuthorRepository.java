package mariami.chakhvadze.bookstore.repository;

import mariami.chakhvadze.bookstore.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
