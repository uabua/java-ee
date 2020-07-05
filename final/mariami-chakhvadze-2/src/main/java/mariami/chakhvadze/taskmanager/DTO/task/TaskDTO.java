package mariami.chakhvadze.taskmanager.DTO.task;

import lombok.Data;

import java.util.Date;

@Data
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
}
