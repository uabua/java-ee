package ge.btu.lecture08.service.impl;

import ge.btu.lecture08.DTO.student.StudentsInput;
import ge.btu.lecture08.DTO.student.StudentsOutput;
import ge.btu.lecture08.enums.GenderType;
import ge.btu.lecture08.model.Student;
import ge.btu.lecture08.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceMockIml implements StudentService {
    List<Student> students;

    public StudentServiceMockIml() {
        students = new ArrayList<>();

        students.add(new Student(1L, "Nika", "Nika", GenderType.MALE));
        students.add(new Student(2L, "Mari", "Mari", GenderType.FEMALE));
        students.add(new Student(3L, "Dato", "Dato", GenderType.MALE));
        students.add(new Student(4L, "Ani", "Ani", GenderType.FEMALE));
    }

//    @Override
//    public List<Student> students() {
//        return students;
//    }

    @Override
    public StudentsOutput students(StudentsInput studentsInput) {
        List<Student> newStudentsList = new ArrayList<>();

        for (Student student : students) {
            if (student.getGenderType().equals(studentsInput.getGenderType())) {
                newStudentsList.add(student);
            }
        }

        StudentsOutput studentsOutput = new StudentsOutput();
        studentsOutput.setStudents(newStudentsList);
        return studentsOutput;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void updateStudent(Long id, Student student) {
        for (Student currentStudent : students) {
            if (currentStudent.getId().equals(id)) {
                currentStudent.setFirstName(student.getFirstName());
                currentStudent.setLastName(student.getLastName());
                currentStudent.setGenderType(student.getGenderType());
                currentStudent.setId(student.getId());
            }
        }
    }

    @Override
    public void deleteStudent(Long id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
            }
        }
    }
}
