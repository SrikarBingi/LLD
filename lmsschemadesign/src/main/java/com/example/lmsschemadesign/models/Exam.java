package com.example.lmsschemadesign.models;

import jakarta.persistence.Entity;

@Entity
public class Exam extends BaseModel{

    int duration;
    String name;
}

