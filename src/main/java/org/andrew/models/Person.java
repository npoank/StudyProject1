package org.andrew.models;


import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;


public class Person {

    private int id;

    @NotEmpty(message = "Name must not be empty")
    @Size(min = 1, max = 40, message = "Invalid name size (1-40 symbols)")
    private String fullName;

    @Min(value = 1900, message = "Year of birth must be more than 1900")
    private int dateOfBirth;

    public Person() {
    }

    public Person(int id, String fullName, int dateOfBirth) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
