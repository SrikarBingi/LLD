package com.example.lmsschemadesign.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

@Entity
public class Student extends BaseModel{

    String name;

    String addr;
    String email;
    String password;
    String phoneNumber;

    @ManyToMany
    List<Module> enrolledModules;
}
