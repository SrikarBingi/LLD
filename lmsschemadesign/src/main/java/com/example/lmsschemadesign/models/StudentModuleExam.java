package com.example.lmsschemadesign.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class StudentModuleExam extends BaseModel{

    @ManyToOne
    Student student;

    @ManyToOne
    ModuleExam moduleExam;
    int marks;
}
