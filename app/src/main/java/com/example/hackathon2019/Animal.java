package com.example.hackathon2019;
import java.net.URL;

public class Animal {
    String location;
    int size;
    String currentOwner;
    String animalType;
    String animalSubCategory;
    String imageLink;
    int gender; //1 female 0 male

    int suitableForApartment;
    int friendly;
    int treatment;
    boolean suitableForMoreAnimals;
    int climate;
    int suitableForAllergic;

    public void setCurrentOwner(String currentOwner) {
        this.currentOwner = currentOwner;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setAnimalSubCategory(String animalSubCategory) {
        this.animalSubCategory = animalSubCategory;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setSuitableForApartment(int suitableForApartment) {
        this.suitableForApartment = suitableForApartment;
    }

    public void setFriendly(int friendly) {
        this.friendly = friendly;
    }

    public void setTreatment(int treatment) {
        this.treatment = treatment;
    }

    public void setSuitableForMoreAnimals(boolean suitableForMoreAnimals) {
        this.suitableForMoreAnimals = suitableForMoreAnimals;
    }

    public void setClimate(int climate) {
        this.climate = climate;
    }

    public void setSuitableForAllergic(int suitableForAllergic) {
        this.suitableForAllergic = suitableForAllergic;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
