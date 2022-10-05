package com.ltp.gradesubmission.service;
import java.util.List;

import com.ltp.gradesubmission.Constants;
import com.ltp.gradesubmission.Grade;
import com.ltp.gradesubmission.repository.GradeRepository;

//middle man between controller and Repository
public class GradeService {
    GradeRepository gradeRepository= new GradeRepository();

    //earlier it was get grade 
    public Grade getGradeIndex(int index){
        return gradeRepository.getGradeIndex(index);
    }
    public void  addGrade( Grade grade){
        gradeRepository.addGrade(grade);   
    }
    public void updateGrade(int index, Grade grade){
        gradeRepository.updateGrade( index, grade);

    }
    public List<Grade> getGrades(){
       return gradeRepository.getGrades();
    }
//logic from controller
/* public Integer getGradesIndex(String id){
    for(int i=0;i< gradeService.getGrade().size(); i++){
        if(((Grade) gradeService.getGrade().get(i)).getId().equals(id)) return i;
    }
    return Constants.NOT_FOUND;
} */

/*
  public String getForm(Model model, @RequestParam(required=false) String id){
          Grade grade;
      //inialize empty grade if the index doesnt match or else bound with form
      int index= gradeService.getGradesIndex(id);
          model.addAttribute("grade", index==Constants.NOT_FOUND ? new Grade(): gradeService.getGrade(index));
            return "form";
        }
 */


public int getGradeIndex(String id) {
    for (int i = 0; i < getGrades().size(); i++) {
        if (getGradeIndex(i).getId().equals(id)) return i;
    }
    return Constants.NOT_FOUND;

}
 
public Grade getGradeById(String id) {
    int index = getGradeIndex(id);
    return index == Constants.NOT_FOUND ? new Grade() : getGradeIndex(index);
}

public void submitGrade(Grade grade) {
    int index = getGradeIndex(grade.getId());
    if (index == Constants.NOT_FOUND) {
        addGrade(grade);
    } else {
        updateGrade(index, grade);
    }   
}  
   
}
