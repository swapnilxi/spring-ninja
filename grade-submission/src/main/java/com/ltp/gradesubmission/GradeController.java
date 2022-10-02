package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {
    List<Grade> studentGrades= new ArrayList<>();
    
    @GetMapping("/grades")
    public String getGrades(Model model)
    {
        studentGrades.add(new Grade("swapnil", "computerVision", "a"));
        
        studentGrades.add(new Grade("swapnil", "computerVision", "a"));
        
        studentGrades.add(new Grade("darshit", "java", "a2"));

        
       // Grade grade= new Grade("swapnil", "history", "a1");
       model.addAttribute("grade", studentGrades );
        return "grades";
    }

    
}