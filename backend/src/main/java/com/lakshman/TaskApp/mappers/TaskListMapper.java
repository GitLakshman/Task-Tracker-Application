package com.lakshman.TaskApp.mappers;

import com.lakshman.TaskApp.domain.dto.TaskListDto;
import com.lakshman.TaskApp.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
