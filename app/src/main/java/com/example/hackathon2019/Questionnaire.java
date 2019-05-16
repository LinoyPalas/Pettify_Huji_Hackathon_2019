package com.example.hackathon2019;

public class Questionnaire {

    //  personal questions
    int familyStatus; // Single\Married\With children
    //  living
    int residence;
    String area; //north, south, center
    boolean anotherAnimal;
    //  healthy
    boolean allergies;
    //  workPlace
    int workStatus; //0 not working

    boolean animalFriendly;
  
    public Questionnaire(int familyStatus, int residence, String area, boolean anotherAnimal,
                         boolean allergies, int workStatus, boolean animalFriendly){
        this.familyStatus = familyStatus;
        this.residence = residence;
        this.area = area;
        this.anotherAnimal = anotherAnimal;
        this.allergies = allergies;
        this.workStatus = workStatus;
        this.animalFriendly = animalFriendly;
    }
}
