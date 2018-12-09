package com.vcc.tradefinanceportal.validation;

import com.vcc.tradefinanceportal.validation.annotation.SwiftLength;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SwiftLengthValidator implements ConstraintValidator<SwiftLength,String> {

    protected int length;

    @Override
    public void initialize(SwiftLength swiftLength) {
        this.length = swiftLength.length();
    }

    @Override
    public boolean isValid(String input, ConstraintValidatorContext constraintValidatorContext) {
        if (length >= input.length()) {
            return true;
        } else {
            return false;
        }

    }
    }


