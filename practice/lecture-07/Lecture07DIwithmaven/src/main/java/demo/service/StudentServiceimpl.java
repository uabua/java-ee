package demo.service;

import demo.model.Student;
import org.springframework.stereotype.Service;
import demo.repository.StudentRepository;

import java.util.List;

@Service("StudentService")
public class StudentServiceimpl implements demo.service.StudentService {

    StudentRepository studentRepository;

    public StudentServiceimpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
