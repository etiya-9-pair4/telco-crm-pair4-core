package io.github.anilaygun.exception.response;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessExceptionResponse {
    private int status;
    private String error;
}
