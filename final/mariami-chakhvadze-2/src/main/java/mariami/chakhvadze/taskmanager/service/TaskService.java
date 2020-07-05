package mariami.chakhvadze.taskmanager.service;

import mariami.chakhvadze.taskmanager.DTO.task.*;

public interface TaskService {
    GetTasksOutput getTasks(GetTasksInput getTasksInput);

    AddTaskOutput addTask(AddTaskInput addTaskInput);

    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);
}
