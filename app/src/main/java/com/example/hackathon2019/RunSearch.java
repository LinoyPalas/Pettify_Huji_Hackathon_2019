package com.example.hackathon2019;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

class UniquePair implements Comparable<UniquePair>{
    public Integer score;
    public Animal animal;

    UniquePair(int score, Animal animal){
        this.score = score;
        this.animal = animal;
    }

    public int compareTo(UniquePair other){
        return this.score.compareTo(other.score);
    }
}

public class RunSearch {
    User user;
    ArrayList<Animal> allAnimals;
    Match matcher;
    float[] scores;
    ArrayList<UniquePair> bestMatch;
    

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
        ArrayList<UniquePair> results = new ArrayList<>();

        for (int i = 0; i < numOfAnimalsInDatabase; i++){
            Match matcher = new Match(this.allAnimals.get(i), this.user);
            results.add(new UniquePair(matcher.getMatch(), this.allAnimals.get(i)));
        }
        Collections.reverse(results);

        this.bestMatch = new ArrayList<UniquePair>(results.subList(0, 6));
    }
    
}
