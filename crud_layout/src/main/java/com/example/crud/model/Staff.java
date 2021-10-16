package com.example.crud.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Staff {
    @JsonIgnore
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private long passportNumber;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public long getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(long passportNumber) {
        this.passportNumber = passportNumber;
    }
    
}
