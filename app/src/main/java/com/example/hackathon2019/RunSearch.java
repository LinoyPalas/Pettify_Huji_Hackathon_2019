package com.example.hackathon2019;

import android.annotation.TargetApi;
import android.os.Build;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

class UniquePair implements Comparable<UniquePair> {
    public Integer score;
    public Animal animal;

    UniquePair(int score, Animal animal) {
        this.score = score;
        this.animal = animal;
    }

    public int compareTo(UniquePair other) {
        return this.score.compareTo(other.score);
    }
}

public class RunSearch {
    User user;
    ArrayList<Animal> allAnimals;
    Match matcher;
    float[] scores;
    ArrayList<UniquePair> bestMatch;
    String jsonFile = "/com/example/hackathon2019/animals.json";


    RunSearch(User user) {
        this.user = user;
    }

    @TargetApi(Build.VERSION_CODES.O)  // omer added this !!!
    public void readFromJsonFile() {
        ArrayList<Animal> result = new ArrayList<Animal>();

        try {
            String text = new String(Files.readAllBytes(Paths.get(jsonFile)), StandardCharsets.UTF_8);

            JSONObject obj = new JSONObject(text);
            JSONArray arr = obj.getJSONArray("/com/example/hackathon2019/animals.json");

            for (int i = 0; i < arr.length(); i++) {
                String type = arr.getJSONObject(i).getString("animale_type");
                String area = arr.getJSONObject(i).getString("animale_type");
                int suitableForApartment = Integer.parseInt(arr.getJSONObject(i).getString("suitable_for_apartment"));
                boolean friendly = Boolean.parseBoolean(arr.getJSONObject(i).getString("friendly"));
                int treatment = Integer.parseInt(arr.getJSONObject(i).getString("treatment"));
                boolean suitableForMoreAnimals = Boolean.parseBoolean(arr.getJSONObject(i).getString("suitable_for_more_animals"));
                String imageLink = arr.getJSONObject(i).getString("image_link");
                String description = arr.getJSONObject(i).getString("description");
                String city = arr.getJSONObject(i).getString("city");
                String phoneNum = arr.getJSONObject(i).getString("phone_num");
                String organization = arr.getJSONObject(i).getString("organization");

                result.add(new Animal(type, area, suitableForApartment, friendly, treatment,
                        suitableForMoreAnimals, city, phoneNum, organization, imageLink,
                        description));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        this.allAnimals = result;
    }


    public void runMatching() {
        readFromJsonFile();
        int numOfAnimalsInDatabase = this.allAnimals.size();
        ArrayList<UniquePair> results = new ArrayList<>();

        for (int i = 0; i < numOfAnimalsInDatabase; i++) {
            Match matcher = new Match(this.allAnimals.get(i), this.user);
            results.add(new UniquePair(matcher.getMatch(), this.allAnimals.get(i)));
        }
        Collections.reverse(results);

        this.bestMatch = new ArrayList<UniquePair>(results.subList(0, 6));
    }

}