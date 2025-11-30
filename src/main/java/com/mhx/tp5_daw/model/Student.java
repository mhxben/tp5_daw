package com.mhx.tp5_daw.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    private String Name;
    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }

    private String Email;
    public void setEmail(String email) {
        Email = email;
    }
    public String getEmail() {
        return Email;
    }

    private int Age;
    public void setAge(int age) {
        Age = age;
    }
    public int getAge() {
        return Age;
    }
}
