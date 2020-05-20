package ge.btu.lecture08.service;

import ge.btu.lecture08.DTO.student.StudentsInput;
import ge.btu.lecture08.DTO.student.StudentsOutput;
import ge.btu.lecture08.model.Student;

import java.util.List;

public interface StudentService {
    //    List<Student> students();
    StudentsOutput students(StudentsInput studentsInput);

    void addStudent(Student student);

    void updateStudent(Long id, Student student);

    void deleteStudent(Long id);
}
