package lk.eyepax.swiftValidation.validation.annotation;


import lk.eyepax.swiftValidation.validation.SwiftTypeValidator;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;


@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { SwiftTypeValidator.class })
public @interface SwiftType {


    String message() default "Must be {type} character";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
    String type();


}
