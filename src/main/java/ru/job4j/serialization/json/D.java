package ru.job4j.serialization.json;

import org.json.JSONObject;

public class D {
    private C c;

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    public static void main(String[] args) {
        C c = new C();
        D d = new D();
        c.setD(d);
        d.setC(c);

        System.out.println(new JSONObject(d));
    }
}