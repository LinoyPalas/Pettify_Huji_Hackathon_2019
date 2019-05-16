package com.example.hackathon2019;

public class User {
    String name;
    Questionnaire questionnaire;

    public User(Questionnaire questionnaire){
        this.name = questionnaire.name;
        this.questionnaire = questionnaire;
    }
    
}
