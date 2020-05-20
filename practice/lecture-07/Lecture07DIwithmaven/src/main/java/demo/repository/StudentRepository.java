package demo.repository;

import demo.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
}
