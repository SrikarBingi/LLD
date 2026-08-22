package com.example.lmsschemadesign.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class StudentModule extends BaseModel{

    @ManyToOne
    Student student;

    @ManyToOne
    Module module;
}
