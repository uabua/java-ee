package ge.btu.lecture08.DTO.student;

import ge.btu.lecture08.enums.GenderType;
import lombok.Data;

@Data
public class StudentsInput {
    private GenderType genderType;
}
