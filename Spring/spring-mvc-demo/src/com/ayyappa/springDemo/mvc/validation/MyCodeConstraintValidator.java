package com.ayyappa.springDemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCodeConstraintValidator
implements ConstraintValidator<MyCode, String>{

	private String prefix;
	@Override
	public void initialize(MyCode myCode) {
		prefix=myCode.value();
	}
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		boolean result;
		if(theCode!=null) {
			result=theCode.startsWith(prefix);
		}
		else {
			result=true;
		}
		
		return result;
	}
	
}
