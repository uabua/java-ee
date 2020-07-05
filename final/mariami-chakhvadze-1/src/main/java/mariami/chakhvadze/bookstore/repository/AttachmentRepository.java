package mariami.chakhvadze.bookstore.repository;

import mariami.chakhvadze.bookstore.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
