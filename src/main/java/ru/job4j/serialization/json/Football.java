package ru.job4j.serialization.json;

import java.util.Arrays;

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

    @Override
    public String toString() {
        return "Football{"
                + "player=" + player
                + ", age=" + age
                + ", position=" + position
                + ", club=" + Arrays.toString(club)
                + '}';
    }
}