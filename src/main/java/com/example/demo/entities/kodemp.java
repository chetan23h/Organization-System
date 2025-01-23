package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class kodemp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;

    @Column
    int salary;

    @Column
    String designation;

    @Column
    String email;

    public kodemp() {
        // Default constructor
    }

    public kodemp(int id, String name, int salary, String designation, String email) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.email = email;
    }

    public kodemp(String name, int salary, String designation, String email) {
        super();
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.email = email;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
