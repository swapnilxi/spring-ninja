package com.ltp.gradesubmission;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GradeController {
    List<Grade> studentGrades=  Arrays.asList(
    new Grade("swapnil", "computerVision", "a"),
        
    new Grade("swapnil", "computerVision", "a"),
        
    new Grade("darshit", "java", "a2")
    );
    
    @GetMapping("/grades")
    public String getGrades(Model model)
    {

       // Grade grade= new Grade("swapnil", "history", "a1");
       model.addAttribute("grade", studentGrades );
        return "grades";
    }
    @GetMapping("/form")
        public String gradeForm(Model model){
          model.addAttribute("grade", new Grade("swapnil", "chemistry", "A1"));
            return "form";
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