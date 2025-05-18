package com.lakshman.TaskApp.domain.dto;

import com.lakshman.TaskApp.domain.entities.TaskPriority;
import com.lakshman.TaskApp.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
    UUID id,
    String title,
    String description,
    LocalDateTime dueDate,
    TaskPriority priority,
    TaskStatus status){
}
