package com.ltp.gradesubmission.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ltp.gradesubmission.Constants;
import com.ltp.gradesubmission.Grade;
import com.ltp.gradesubmission.repository.GradeRepository;

@Controller
public class GradeController {
    GradeRepository gradeRepository= new GradeRepository();
    // List<Grade> studentGrades = new ArrayList<>();//moved to repository class
    // List<Grade> studentGrades=  Arrays.asList(
    // new Grade("swapnil", "computerVision", "a"),
        
    // new Grade("swapnil", "computerVision", "a"),
        
    // new Grade("darshit", "java", "a2")
    // );
    
    @GetMapping("/")
    public String getHome(Model model)
    {

       model.addAttribute("home" );
        return "home";
    }
    @GetMapping("/grades")
    public String getGrades(Model model)
    {

       // Grade grade= new Grade("swapnil", "history", "a1");
       model.addAttribute("grade", gradeRepository.getGrades());
        return "grades";
    }

   
    public Integer getGradesIndex(String id){
        for(int i=0;i< gradeRepository.getGrades().size(); i++){
            if(((Grade) gradeRepository.getGrades().get(i)).getId().equals(id)) return i;
        }
        return Constants.NOT_FOUND;
    }

    @GetMapping("/form")
        public String getForm(Model model, @RequestParam(required=false) String id){
        //   model.addAttribute("grade", new Grade("", "", ""));
          Grade grade;
      //inialize empty grade if the index doesnt match or else boud with form
      int index= getGradesIndex(id);
          model.addAttribute("grade", index==Constants.NOT_FOUND ? new Grade(): gradeRepository.getGrade(index));
            return "form";
        }

        @PostMapping("/handleSubmit")
        public String submitGrade( @Valid Grade grade, BindingResult result){
            System.out.println(grade);
            System.out.println("has errors?" + result.hasErrors());
            if(result.hasErrors()){
                return "form";
            }
            int index= getGradesIndex(grade.getId());
            if(index==Constants.NOT_FOUND){
                gradeRepository.addGrade(grade);
            } else{
                gradeRepository.updateGrade(index, grade);
            }
        
            return "redirect:/grades";

    
        }
    
    }





// @GetMapping("/grades")
// public String getGrades(Model model)
// {
//     studentGrades.add(new Grade("swapnil", "computerVision", "a"));
    
//     studentGrades.add(new Grade("swapnil", "computerVision", "a"));
    
//     studentGrades.add(new Grade("darshit", "java", "a2"));

    
//    // Grade grade= new Grade("swapnil", "history", "a1");
//    model.addAttribute("grade", studentGrades );
//     return "grades";
// }


// }