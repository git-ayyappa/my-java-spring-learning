package com.ayyappa.springDemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=MyCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCode {
	//define default course code
	public String value() default "AYP";
	//define default error message
	public String message() default "must start with AYP";
	//define default groups
	public Class<?>[] groups() default{}; 
	//define default payload
	public Class<? extends Payload>[] payload() default{}; 
}