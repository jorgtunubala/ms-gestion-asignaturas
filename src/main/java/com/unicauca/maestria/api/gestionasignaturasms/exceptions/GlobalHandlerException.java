package com.unicauca.maestria.api.gestionasignaturasms.exceptions;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class GlobalHandlerException {

    @ExceptionHandler(value = {ResourceNotFoundException.class})
    public ResponseEntity<Object> notFoundExceptionHandler(ResourceNotFoundException exception, WebRequest request) {
        HttpStatus estado = HttpStatus.NOT_FOUND;
        Exception exc = Exception.builder()
                .mensaje(exception.getMessage())
                .estado(estado)
                .marcaTiempo(LocalDate.now())
                .descripcionUrl(request.getDescription(false))
                .build();

        return new ResponseEntity<Object>(exc, estado);
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity<Object> handleValidationException(ConstraintViolationException ex) {
        Map<String, Object> errors = new HashMap<>();

        ex.getConstraintViolations().forEach(violation -> {
            String attributeName = violation.getPropertyPath().toString();
            String fieldName = attributeName.substring(attributeName.lastIndexOf('.') + 1);
            errors.put(fieldName, "El campo: " + fieldName + ", " + violation.getMessage());
        });

        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(value = {FieldErrorException.class})
    public ResponseEntity<Object> fieldErrorExceptionHandler(FieldErrorException exception, WebRequest request) {
        HttpStatus estado = HttpStatus.BAD_REQUEST;
        Map<String, Object> errors = new HashMap<>();

        exception.getResult().getFieldErrors().forEach(error -> {
            errors.put(error.getField(), "El campo: " + error.getField() + ", " + error.getDefaultMessage());
        });

        return new ResponseEntity<Object>(errors, estado);
    }

    @ExceptionHandler(value = {FieldUniqueException.class})
    public ResponseEntity<Object> fieldUniqueExceptionHandler(FieldUniqueException exception, WebRequest request) {
        return new ResponseEntity<Object>(exception.getInformacionCamposUnicos(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
