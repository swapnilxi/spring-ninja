package com.ltp.gradesubmission;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GradeController {
    List<Grade> studentGrades = new ArrayList<>();
    // List<Grade> studentGrades=  Arrays.asList(
    // new Grade("swapnil", "computerVision", "a"),
        
    // new Grade("swapnil", "computerVision", "a"),
        
    // new Grade("darshit", "java", "a2")
    // );
    
    @GetMapping("/grades")
    public String getGrades(Model model)
    {

       // Grade grade= new Grade("swapnil", "history", "a1");
       model.addAttribute("grade", studentGrades );
        return "grades";
    }

    public Integer getGradesIndex(String name){
        for(int i=0;i< studentGrades.size(); i++){
            if(studentGrades.get(i).getName().equals(name)) return i;
        }
        return -1000;
    }

    @GetMapping("/form")
        public String getForm(Model model, @RequestParam(required=false) String name){
        //   model.addAttribute("grade", new Grade("", "", ""));
          Grade grade;
      //inialize empty grade if the index doesnt match or else boud with form
          model.addAttribute("grade", getGradesIndex(name)==-1000 ? new Grade("","",""): studentGrades.get(getGradesIndex(name)));
            return "form";
        }

        @PostMapping("/handleSubmit")
        public String submitGrade(Grade grade){
            System.out.println(grade);
            int index= getGradesIndex(grade.getName());
            if(index==-1000){
                studentGrades.add(grade);
            } else{
                studentGrades.set(index,grade);
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