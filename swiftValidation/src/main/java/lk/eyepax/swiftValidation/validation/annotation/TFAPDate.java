package lk.eyepax.swiftValidation.validation.annotation;

import lk.eyepax.swiftValidation.validation.TFAPDateValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { TFAPDateValidator.class })
public @interface TFAPDate {

    String message() default "Date must be YY-MM-DD format";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
