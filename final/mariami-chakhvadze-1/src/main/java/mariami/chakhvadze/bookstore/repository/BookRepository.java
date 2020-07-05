package mariami.chakhvadze.bookstore.repository;

import mariami.chakhvadze.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
