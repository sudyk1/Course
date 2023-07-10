package com.example.oop.basics.inheritance.super_example;

import java.util.Locale;

public class Teacher extends Person {

    private String teachingSubject; //np. math

    //Constructors
    public Teacher(String name, String surname, String teachingSubject) {
        super(name, surname);
        this.setTeachingSubject(teachingSubject);
    }

    //Getters and Setters
    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        switch (teachingSubject.toLowerCase(Locale.ROOT)) {
            case "math":
            case "english":
            case "sport":
            case "biology":
                this.teachingSubject = teachingSubject;
                break;
            default:
                this.teachingSubject = "unknown";
        }
    }
}
