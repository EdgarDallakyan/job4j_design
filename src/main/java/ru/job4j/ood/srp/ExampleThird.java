package ru.job4j.ood.srp;

import java.util.ArrayList;
import java.util.List;

public class ExampleThird {
    List<ExampleThird> list = new ArrayList<>();
    public void add(ExampleThird exampleThird) {
        list.add(exampleThird);
    }
    public void print() {
        list.forEach(System.out::println);
    }
}
