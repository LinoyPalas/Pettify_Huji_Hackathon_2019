package com.example.hackathon2019;

import android.util.Pair;

import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class UniqePair implements Comparable<UniqePair>{
    public Integer score;
    public Animal animal;

    UniqePair(int score, Animal animal){
        this.score = score;
        this.animal = animal;
    }

    public int compareTo(UniqePair other){
        return this.score.compareTo(other.score);
    }
}

public class RunSearch {
    User user;
    ArrayList<Animal> allAnimals;
    Match matcher;
    float[] scores;

    RunSearch(User user) {
        this.user = user;
    }

    public void readFromJsonFile(String fileName) {
        ArrayList<Animal> result = new ArrayList<Animal>();

        try {
            String text = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);

            JSONObject obj = new JSONObject(text);
            JSONArray arr = obj.getJSONArray("com/example/hackathon2019/animals.json");

            for (int i = 0; i < arr.length(); i++) {
                String type = arr.getJSONObject(i).getString("animale_type");
                String area = arr.getJSONObject(i).getString("animale_type");
                int suitableForApartment = Integer.parseInt(arr.getJSONObject(i).getString("suitable_for_apartment"));
                boolean friendly = Boolean.parseBoolean(arr.getJSONObject(i).getString("friendly"));
                int treatment = Integer.parseInt(arr.getJSONObject(i).getString("treatment"));
                boolean suitableForMoreAnimals = Boolean.parseBoolean(arr.getJSONObject(i).getString("suitable_for_more_animals"));
                String imageLink = arr.getJSONObject(i).getString("image_link");

                result.add(new Animal(type, area, imageLink, "", suitableForApartment,
                        friendly, treatment, suitableForMoreAnimals));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        this.allAnimals = result;
    }


    public void runMatching(){
        int numOfAnimalsInDatabase = this.allAnimals.size();
        ArrayList<UniqePair> results = new ArrayList<>();

        for (int i = 0; i < numOfAnimalsInDatabase; i++){
            Match matcher = new Match(this.allAnimals.get(i), this.user);
            results.add(new UniqePair(matcher.getMatch(), this.allAnimals.get(i)));
        }
        Collections.reverse(results);




    }
}
