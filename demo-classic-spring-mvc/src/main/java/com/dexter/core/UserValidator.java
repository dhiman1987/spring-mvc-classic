package com.dexter.core;

import com.dexter.model.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User)target;

        //field validations
        ValidationUtils.rejectIfEmptyOrWhitespace(
                errors,"name",
                "name.error.empty",
                "Name cannot be blank"
        );

        //business validation
        if(user.getAge()<1){
            errors.rejectValue("age",
                    "age.error.low.value","Age must be greater than zero");
        }
    }
}
