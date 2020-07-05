package mariami.chakhvadze.taskmanager.repository;

import mariami.chakhvadze.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
