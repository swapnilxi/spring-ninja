package com.ltp.gradesubmission;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ScoreValidator implements ConstraintValidator< Scorex, String >{
    List<String> scores = Arrays.asList("A+", "A", "B+", "B","C+", "C", "D+", "D", "F");
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        for(String string: scores){
            if(value.equals(string)) return true;
        }
        return false;
    }

}
