package ge.btu.lecture09.repository;

import ge.btu.lecture09.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
