package ru.job4j.ood.lsp;

public class ThirdExample {
    public ThirdExample get() {
        return new ThirdExample();
    }
}

class Dog extends ThirdExample {
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public Dog get() {
        sleep();
        return new Dog();
    }
}