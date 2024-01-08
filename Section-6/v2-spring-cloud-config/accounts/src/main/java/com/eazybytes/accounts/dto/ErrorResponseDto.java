package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(name="Error Response",
        description="Schema to hold error response information")
public class ErrorResponseDto {
     @Schema(description="Api path invoked by client")
     private String apiPath;
     @Schema(description="Error code in the response")
     private HttpStatus errorCode;
     @Schema(description="Error message in the response", example="200")
     private String errorMsg;
     @Schema(description="Time representing when error has happened")
     private LocalDateTime errorTime;

}
