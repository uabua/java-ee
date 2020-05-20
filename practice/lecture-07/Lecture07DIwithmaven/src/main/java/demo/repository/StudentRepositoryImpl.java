package demo.repository;


import demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("StudentRepository")
public class StudentRepositoryImpl implements demo.repository.StudentRepository {
    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe"));

        return studentList;
    }
}
