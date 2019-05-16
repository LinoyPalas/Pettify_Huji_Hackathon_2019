package com.example.hackathon2019;

public class Questionnaire {
//  personal questions
    String name;
    String mail;
    int age;
    String status; // Single\Married\With children

//  living
    String residence;
    String climate;
    String residenceSize;
    boolean Yard;
    boolean anotherAnimal;
    String residenceKind; // Apartment\House

//  healthy
    boolean allergies;
    String allergiesKind; // kind of animal

//  workPlace
    boolean working;
    String workKind;

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public void setResidenceSize(String residenceSize) {
        this.residenceSize = residenceSize;
    }

    public void setYard(boolean yard) {
        Yard = yard;
    }

    public void setAnotherAnimal(boolean anotherAnimal) {
        this.anotherAnimal = anotherAnimal;
    }

    public void setResidenceKind(String residenceKind) {
        this.residenceKind = residenceKind;
    }

    public void setAllergies(boolean allergies) {
        this.allergies = allergies;
    }

    public void setAllergiesKind(String allergiesKind) {
        this.allergiesKind = allergiesKind;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public void setWorkKind(String workKind) {
        this.workKind = workKind;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setAnimalFriendly(boolean animalFriendly) {
        this.animalFriendly = animalFriendly;
    }

    int hours;
    boolean animalFriendly;

    public Questionnaire(){}




}
