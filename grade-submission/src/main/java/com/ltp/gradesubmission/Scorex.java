package com.ltp.gradesubmission;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy= ScoreValidator.class)
public @interface Scorex{
    String message() default "Invalid Data";
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}