package ru.job4j.ood.lsp;

public class SecondExample {
    Integer sum(int a, int b) {
        return a + b;
    }
}
class NewNumber extends SecondExample {
    Integer sum(int a, int b) {
        return null;
    }
}

