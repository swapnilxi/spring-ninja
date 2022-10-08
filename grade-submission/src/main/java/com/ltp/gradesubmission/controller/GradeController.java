package com.ltp.gradesubmission.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.ltp.gradesubmission.Grade;
import com.ltp.gradesubmission.service.GradeService;

@Controller
public class GradeController {
    @Autowired
    GradeService gradeService;
    // GradeService gradeService = new GradeService();
    /*GradeRepository gradeRepository= new GradeRepository();
   Refer to repository branch for old code */
    
    @GetMapping("/")
    public String getHome(Model model)
    {
       model.addAttribute("home" );
        return "home";
    }

    @GetMapping("/grades")
    public String getGrades(Model model)
    {
       model.addAttribute("grade", gradeService.getGrades());
        return "grades";
    }

    @GetMapping("/form")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        model.addAttribute("grade", gradeService.getGradeById(id));
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Grade grade, BindingResult result) {
        if (result.hasErrors()) return "form";
        gradeService.submitGrade(grade);
        return "redirect:/grades";
    }   
 }
