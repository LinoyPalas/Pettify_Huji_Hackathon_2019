package com.example.hackathon2019;

public class Questionnaire {
//  personal questions
    String name;
    String mail;
    int age;
    int familyStatus; // Single\Married\With children

//  living
     int residence;
    String area; //north, south, center
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

    public void setFamilyStatus(int familyStatus) {
        this.familyStatus = familyStatus;
    }

    public void setResidence(int residence) {
        this.residence = residence;
    }

    public void setArea(String area) {
        this.area = area;
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
