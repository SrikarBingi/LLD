package com.example.lmsschemadesign.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Module extends BaseModel{
    
    String name;

    @OneToMany(mappedBy = "module")
    List<StudentModule> enrolledStudents;

    @OneToMany(mappedBy = "module")
    List<ModuleExam> exams;
}
