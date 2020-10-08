package com.reminder.reminders.ErrorHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class Exceptionhandler  extends ResponseEntityExceptionHandler {
    @ExceptionHandler(NoRecordFound.class)
    public <T> ResponseEntity<Object> handleNoRecordsExceptions(
            Exception ex, T request) {
       ApiErrors api  = ApiErrors.newBuilder();
       api.setCode(10001);
       api.setMessage(ex.getMessage());
        return new ResponseEntity<>(api, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public <T> ResponseEntity<Object> handleAllExceptions(
            Exception ex, T request) {
        ApiErrors body  = ApiErrors.newBuilder();
        body.setCode(50001);
        body.setMessage(ex.getMessage());
        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
