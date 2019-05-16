package com.example.hackathon2019;
import java.net.URL;

public class Animal {
    String animalType;
    String area;
    String imageLink;
    String description;

    int suitableForApartment;
    boolean friendly;
    int treatment;
    boolean suitableForMoreAnimals;

    public Animal(String animalType, String area, String imageLink, String description, int suitableForApartment,
                  boolean friendly, int treatment, boolean suitableForMoreAnimals){
        this.animalType = animalType;
        this.area = area;
        this.imageLink = imageLink;
        this.description = description;
        this.suitableForApartment = suitableForApartment;
        this.friendly = friendly;
        this.treatment = treatment;
        this.suitableForMoreAnimals = suitableForMoreAnimals;
    }

}
