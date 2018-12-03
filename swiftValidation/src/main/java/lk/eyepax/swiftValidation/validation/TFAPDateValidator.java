package lk.eyepax.swiftValidation.validation;

import lk.eyepax.swiftValidation.validation.annotation.TFAPDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TFAPDateValidator implements ConstraintValidator<TFAPDate,String> {



    @Override
    public void initialize(TFAPDate tfapDate) {

    }

    @Override
    public boolean isValid(String date, ConstraintValidatorContext constraintValidatorContext) {
        if(date.matches("([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))")){
            return true;
        }
        return false;
    }
}
