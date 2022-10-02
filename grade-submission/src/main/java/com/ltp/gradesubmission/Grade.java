package com.ltp.gradesubmission;

public class Grade {
    private String name;
    private String subject;
    private String scorex;
    public Grade(String name, String subject, String scorex) {
        this.name = name;
        this.subject = subject;
        this.scorex = scorex;
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
    
    
}
