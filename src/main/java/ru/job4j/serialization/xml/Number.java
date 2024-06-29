package ru.job4j.serialization.xml;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "number")
public class Number {

    @XmlAttribute
    private String number;

    public Number() {
    }
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