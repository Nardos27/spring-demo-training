package com.nardos.springdemo.user;

import java.time.LocalDate;

public class User {
    private final Long Id;
    private String firstname;

    private String lastname;

    private LocalDate dateOfBirth;

    private String gender;

    private int age;


    public User(String firstname, String lastname, LocalDate dateOfBirth, String gender, int age, Long Id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.age = age;
        this.Id = Id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getID() {return null;}

    public Object getId() {
        return null;
    }
}
