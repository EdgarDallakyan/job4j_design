package ru.job4j.ood.isp;

public interface Animal {
    void jump();
    void fly();
    void swim();
}

/*
Нарушение принципа ISP заключается в неправильном выделение абстракции,
необходимо разделить интерфейсы на более специфичные, так как
не все животные умеют прыгать, плавать, летать
 */