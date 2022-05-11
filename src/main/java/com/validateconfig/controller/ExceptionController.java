package com.validateconfig.controller;

import javax.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author sunlongfei
 */
@Slf4j
@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public String exception(Exception e) {
        e.printStackTrace();
        return "failed";
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public String constraintViolationException(ConstraintViolationException e) {
        log.warn(e.getMessage());
        return "failed";
    }

    @ExceptionHandler(BindException.class)
    public String bindException(BindException e) {
        log.warn(e.getMessage());
        return "failed";
    }
}
