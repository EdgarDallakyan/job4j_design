package ru.job4j.serialization.json;

public class Position {
    private final String position;

    public Position(String position) {
        this.position = position;
    }

    public String isPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Position{"
                + "position='" + position + '\''
                + '}';
    }

}