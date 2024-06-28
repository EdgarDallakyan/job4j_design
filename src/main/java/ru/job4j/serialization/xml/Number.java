package ru.job4j.serialization.xml;

public class Number {
    private final String number;

    public Number(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number{"
                + "number='" + number + '\''
                + '}';
    }
}