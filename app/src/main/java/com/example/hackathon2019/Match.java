package com.example.hackathon2019;
import java.lang.Math;

public class Match {

    Animal animal;
    User user;

    Match(Animal animal, User user){
        this.animal = animal;
        this.user = user;
    }

    public int getMatch(){
        // returns a percentage of match
        int match = 0;
        if (allergyMatch() && otherAnimalsMatch()){
            match += residenceMatch() + treatmentMatch() + areaMatch() + friendlyMatch();
        }
        return match;

    }

    private boolean allergyMatch()
    {
        //return true if not allergic or not allergic to this animal.
        return !(user.questionnaire.allergies);
    }

    private boolean otherAnimalsMatch()
    {
        //return true if its ok
        return (user.questionnaire.anotherAnimal == animal.suitableForMoreAnimals);
    }

    private int residenceMatch() {
        if (animal.animalType.equals("dog") || animal.animalType.equals("cat")) {
            //0 - garden, 1- first_floor, 2-high_floor
            if (user.questionnaire.residence == 0 || animal.suitableForApartment == 0) {
                return 45;
            } else {
                if (animal.suitableForApartment == 2) {
                    return 0;
                } else {
                    if (animal.animalType.equals("cat")) {
                        if (user.questionnaire.residence == 1) {
                            return helpResidenceMatch(0, 0);
                        } else {
                            return helpResidenceMatch(0, 5);
                        }
                    } else {
                        if (user.questionnaire.residence == 1) {
                            return helpResidenceMatch(5, 0);
                        } else {
                            return helpResidenceMatch(5, 5);
                        }
                    }
                }
            }
        } else {
            return 40;
        }
    }

    private int helpResidenceMatch(int factor,int floor) {
        if (user.questionnaire.workStatus == 0) {
            return 40 - factor - floor;
        } else if (user.questionnaire.workStatus == 1) {
            if (user.questionnaire.animalFriendly) {
                return 40 - factor - floor;
            } else {
                return 30 - factor - floor;
            }
        } else {
            if (user.questionnaire.animalFriendly) {
                return 30 - factor - floor;
            } else {
                return 20 - factor - floor;
            }
        }
    }

    private int treatmentMatch(){
        //married+ = 3, married =2, roomies=1, single=0
        if (animal.treatment == 0){
            return 30;
        } else {
            int workStatuse= 0, animalFriendly =0, familyStatus=0;
            if (user.questionnaire.familyStatus == 0){
                familyStatus = 7;
            } else if (user.questionnaire.familyStatus == 1 || user.questionnaire.familyStatus == 2){
                familyStatus = 5;
            }

            if(user.questionnaire.workStatus == 2){
                workStatuse = 10;
            } else if(user.questionnaire.workStatus == 1){
                workStatuse = 5;
            }

            if(!user.questionnaire.animalFriendly){
                animalFriendly = 5;
            }

            return treatmentMatchHelper(workStatuse, animalFriendly, familyStatus);
        }
    }

    private int treatmentMatchHelper(int workStatue, int animalFriendly, int familyStatus)
    {
        if (animal.treatment == 1){ //mediom
            return 28 - workStatue - animalFriendly - familyStatus;
        } else {
            return 24 - workStatue - animalFriendly - familyStatus;
        }
    }


    private int friendlyMatch(){
        int count = 0;
        if(!animal.friendly){
            if (user.questionnaire.familyStatus == 0){
                count =  20;
            } else {
                count = 15;
            }
        } else {
            if(user.questionnaire.familyStatus == 3){
                count = 20;
            } else if (user.questionnaire.familyStatus == 2 || user.questionnaire.familyStatus == 1){
                count = 17;
            } else {
                count = 15;
            }
            if (user.questionnaire.anotherAnimal){
                count += 2;
            }
        }
        return Math.min(20,count);
    }

    private int areaMatch()
    {
        if(animal.area.equals(user.questionnaire.area)){
            return 5;
        } return 0;
    }
}
