package com.ltp.gradesubmission.repository;

import java.util.ArrayList;
import java.util.List;

import com.ltp.gradesubmission.Grade;

public class GradeRepository {
    private List <Grade> studentGrades= new ArrayList<>();

    public Grade getGrade(int index){
        return studentGrades.get(index);
    }
    public void  addGrade( Grade grade){
            studentGrades.add(grade);   
    }
    public void updateGrade(int index, Grade grade){
        studentGrades.set( index, grade);

    }
    public List getGrades(){
         return studentGrades;
    }
}
