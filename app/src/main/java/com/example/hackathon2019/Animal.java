package com.example.hackathon2019;

public class Animal {

    String animalType;
    String area;
    int suitableForApartment;
    boolean friendly;
    int treatment;
    boolean suitableForMoreAnimals;
    String city;
    String phoneNum;
    String organization;
    String imageLink;
    String description;



    public Animal(String animalType
            ,String area, int suitableForApartment,
                  boolean friendly, int treatment, boolean suitableForMoreAnimals, String city,
                  String phoneNum, String organization, String imageLink, String description){
        this.animalType = animalType;
        this.area = area;
        this.imageLink = imageLink;
        this.description = description;
        this.suitableForApartment = suitableForApartment;
        this.friendly = friendly;
        this.treatment = treatment;
        this.suitableForMoreAnimals = suitableForMoreAnimals;
        this.city = city;
        this.phoneNum = phoneNum;
        this.organization = organization;
    }

}
