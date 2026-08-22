package com.example.lmsschemadesign.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class ModuleExam extends BaseModel {

    @ManyToOne
    Module module;

    @ManyToOne
    Exam exam;

    Date dateOfExam;
}