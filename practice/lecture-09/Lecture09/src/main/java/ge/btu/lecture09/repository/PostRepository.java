package ge.btu.lecture09.repository;

import ge.btu.lecture09.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
