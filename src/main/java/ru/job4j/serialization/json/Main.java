package ru.job4j.serialization.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
    public static void main(String[] args) {
        final Football football = new Football(true, 23, new Position("ST"),
                new String[] {"Borussia Dortmund", "Germany"});

        final Gson gson = new GsonBuilder().create();
        System.out.println(gson.toJson(football));

        final String footballJson =
                "{"
                        + "\"player\":true,"
                        + "\"age\":23,"
                        + "\"position\":"
                        + "{"
                        + "\"position\":\"ST\""
                        + "},"
                        + "\"club\":"
                        + "[\"Borussia Dortmund\",\"Germany\"]"
                        + "}";

        final Football footballMod = gson.fromJson(footballJson, Football.class);
        System.out.println(footballMod);
    }
}