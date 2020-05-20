package ge.btu.lecture08.DTO.student;

import ge.btu.lecture08.model.Student;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StudentsOutput {
    List<Student> students = new ArrayList<>();
}
