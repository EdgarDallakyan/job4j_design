package ru.job4j.serialization.json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Football {
    private final boolean player;
    private final int age;
    private final Position position;
    private final String[] club;


    public Football(boolean player, int age, Position position, String[] club) {
        this.player = player;
        this.age = age;
        this.position = position;
        this.club = club;
    }

    public boolean isPlayer() {
        return player;
    }

    public int isAge() {
        return age;
    }

    public Position isPosition() {
        return position;
    }

    public String[] isClub() {
        return club;
    }

    @Override
    public String toString() {
        return "Football{"
                + "player=" + player
                + ", age=" + age
                + ", position=" + position
                + ", club=" + Arrays.toString(club)
                + '}';
    }

    public static void main(String[] args) {

        JSONObject jsonPosition = new JSONObject("{\"position\":\"ST\"}");

        List<String> list = new ArrayList<>();
        list.add("Borussia Dortmund");
        list.add("Germany");
        JSONArray jsonClub = new JSONArray(list);

        final Football football = new Football(true, 23,
                new Position("ST"), new String[]{"Borussia Dortmund", "Germany"});
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("player", football.isPlayer());
        jsonObject.put("age", football.isAge());
        jsonObject.put("position", jsonPosition);
        jsonObject.put("club", jsonClub);

        System.out.println(jsonObject);

        System.out.println(new JSONObject(football));
    }
}