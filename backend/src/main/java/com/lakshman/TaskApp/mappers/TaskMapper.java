package com.lakshman.TaskApp.mappers;

import com.lakshman.TaskApp.domain.dto.TaskDto;
import com.lakshman.TaskApp.domain.entities.Task;
import com.lakshman.TaskApp.domain.entities.TaskList;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}
