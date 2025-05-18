package com.lakshman.TaskApp.domain.dto;

public record ErrorResponse(
        int status, String message, String details
) {
}
