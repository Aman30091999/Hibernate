package com.tut.firstweb;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String course;
    private String durasation;
    public Certificate(String course, String durasation) {
        this.course = course;
        this.durasation = durasation;
    }
    public Certificate() {
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getDurasation() {
        return durasation;
    }
    public void setDurasation(String durasation) {
        this.durasation = durasation;
    }
    @Override
    public String toString() {
        return "Certificate [course=" + course + ", durasation=" + durasation + "]";
    }
    
    
}
