package com.tut.firstweb;

import javax.persistence.*;
@Entity
@Table(name = "Students")
public class Student {
    //primary Key ID
    @Id
    private int id;
    @Column(name = "Name")
    private String name;
    
    private Certificate certi;
    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public Certificate getCerti() {
        return certi;
    }
    public void setCerti(Certificate certi) {
        this.certi = certi;
    }
    public Student(){
        super();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
    
}
