package ru.job4j.ood.dip;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<String> items = new ArrayList<>();

    /*реализация хранилища*/
}

/*Нарушение DIP происходит потому, что класс Tracker
напрямую зависит от конкретной реализации ArrayList для хранения данных, а не от абстракции.
Поэтому если потребуется изменить тип хранилища (например, на БД или другую коллекцию),
код Tracker потребуется менять.*/