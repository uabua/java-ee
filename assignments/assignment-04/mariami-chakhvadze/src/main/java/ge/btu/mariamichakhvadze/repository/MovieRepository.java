package ge.btu.mariamichakhvadze.repository;

import ge.btu.mariamichakhvadze.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
