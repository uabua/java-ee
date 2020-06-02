package ge.btu.lecture09.repository;

import ge.btu.lecture09.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
