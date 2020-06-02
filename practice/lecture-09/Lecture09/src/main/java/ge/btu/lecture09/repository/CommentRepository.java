package ge.btu.lecture09.repository;

import ge.btu.lecture09.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
