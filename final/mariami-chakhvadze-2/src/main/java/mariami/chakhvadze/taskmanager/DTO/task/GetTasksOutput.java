package mariami.chakhvadze.taskmanager.DTO.task;

import lombok.Data;

import java.util.List;

@Data
public class GetTasksOutput {
    private List<TaskDTO> tasks;
}
