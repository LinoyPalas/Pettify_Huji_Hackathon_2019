package com.example.hackathon2019;

public class Questionnaire {
//  personal questions
    String name;
    String mail;
    int age;
    String status; // Single\Married\With children

//  living
     int residence;
    String climate;
    boolean anotherAnimal;

//  healthy
    boolean allergies;
    String allergiesKind; // kind of animal

//  workPlace
    int workStatus; //0 not working
    boolean animalFriendly;
  
     public Questionnaire(){}

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResidence(int residence) {
        this.residence = residence;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }


    public void setAnotherAnimal(boolean anotherAnimal) {
        this.anotherAnimal = anotherAnimal;
    }


    public void setAllergies(boolean allergies) {
        this.allergies = allergies;
    }

    public void setAllergiesKind(String allergiesKind) {
        this.allergiesKind = allergiesKind;
    }


    public void setWorkStatus(int workStatus) {
        this.workStatus = workStatus;

    }

    public void setAnimalFriendly(boolean animalFriendly) {
        this.animalFriendly = animalFriendly;
    }
}
