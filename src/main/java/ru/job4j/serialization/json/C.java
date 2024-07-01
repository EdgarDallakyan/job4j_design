package ru.job4j.serialization.json;

import org.json.JSONPropertyIgnore;

public class C {
    private D d;

    @JSONPropertyIgnore
    public D getD() {
        return d;
    }

    public void setD(D d) {
        this.d = d;
    }

    public String getHello() {
        return "Hello";
    }
}