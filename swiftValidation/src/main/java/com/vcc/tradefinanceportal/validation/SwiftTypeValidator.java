package com.vcc.tradefinanceportal.validation;

import com.vcc.tradefinanceportal.validation.annotation.SwiftType;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SwiftTypeValidator implements ConstraintValidator<SwiftType,String> {


    protected String character;
    @Override
    public void initialize(SwiftType swiftCharacter) {
        this.character=swiftCharacter.type();
    }

    @Override
    public boolean isValid(String input, ConstraintValidatorContext constraintValidatorContext) {


        if(character.equals("z")){
            if(input.matches("[a-z]*")){
                return true;
            }
            else{
                return  false;
            }

        }
      return false;
    }
}
