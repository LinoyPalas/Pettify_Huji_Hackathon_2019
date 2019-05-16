package com.example.hackathon2019;

public class Match {

    Animal animal;
    User user;

    public boolean allergyMatch()
    {
        //return true if not allergic or not allergic to this animal.
        return !(user.questionnaire.allergies && user.questionnaire.allergiesKind == animal.animalType);
    }

    public boolean otherAnimalsMatch()
    {
        //return true if its ok
        return (user.questionnaire.anotherAnimal == animal.suitableForMoreAnimals);
    }

    public double residenceMatch() {
        if (animal.animalType.equals("dog") || animal.animalType.equals("cat")) {
            //0 - garden, 1- first_floor, 2-high_floor
            if (user.house == 0 || animal.suitableForApartment == 0) {
                return 40;
            } else {
                if (animal.suitableForApartment == 2) {
                    return 0;
                } else {
                    //cat
                    if (animal.animalType == "cat") {
                        if (user.house == 1) { //first floor
                            if (user.work == 0) {
                                return 35;
                            } else if (user.work == 1) {
                                return 25;
                            } else {
                                return 15;
                            }
                        } else { //high floor
                            if (user.work == 0) {
                                return 30;
                            } else if (user.work == 1) {
                                return 20;
                            } else {
                                return 10;
                            }
                        }
                    }

                    //dog
                    else {
                        if (user.house == 1) { //first floor
                            if (user.work == 0) {
                                return 30;
                            } else if (user.work == 1) {
                                return 20;
                            } else {
                                return 10;
                            }
                        } else { //high floor
                            if (user.work == 0) {
                                return 25;
                            } else if (user.work == 1) {
                                return 15;
                            } else {
                                return 5;
                            }
                        }
                    }
                }
            }

        } else {
            return 40;
        }
    }

    


}
