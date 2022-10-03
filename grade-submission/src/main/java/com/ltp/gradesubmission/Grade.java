package com.ltp.gradesubmission;

public class Grade {
    private String name;
    private String scorex;
    private String subject;

    public Grade(String name, String scorex, String subject) {
        this.name = name;
        this.scorex = scorex;
        this.subject = subject;
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
    @Override
    public String toString() {
        return "Grade [name=" + name + ", scorex=" + scorex + ", subject=" + subject + "]";
    }
    
    
}
