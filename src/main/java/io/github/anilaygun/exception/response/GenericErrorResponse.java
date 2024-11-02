package io.github.anilaygun.exception.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericErrorResponse {
    private int status;
    private String error;
    private LocalDateTime timestamp;
}