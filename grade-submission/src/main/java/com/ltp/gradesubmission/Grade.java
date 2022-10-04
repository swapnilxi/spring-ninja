package com.ltp.gradesubmission;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

public class Grade {
    @NotBlank(message= "name cannnot be blank")
    private String name;
    @Scorex(message = "Score Must be a Letter Grade , eg : A+, A..")
    private String scorex;
    @NotBlank(message= "Subject field cannot be blank")
    private String subject;
    private String id;

   
    // public Grade(String name, String scorex, String subject) {
    //     this.name = name;
    //     this.scorex = scorex;
    //     this.subject = subject;
    // }
    public Grade(){
        this.id=UUID.randomUUID().toString();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getScorex() {
        return scorex;
    }
    public void setScorex(String scorex) {
        this.scorex = scorex;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Grade [name=" + name + ", scorex=" + scorex + ", subject=" + subject + "]";
    }
    
    
}
