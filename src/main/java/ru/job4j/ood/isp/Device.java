package ru.job4j.ood.isp;

public interface Device {
    void input(String data);
    void output();
    void connectToInternet();
    void calculate();
}

/*
Нарушение принципа ISP заключается в большом интерфейсе устройства,
и соответственно не всем реализациям потребуются все методы интерфейса
 */