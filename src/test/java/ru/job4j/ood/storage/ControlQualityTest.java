package ru.job4j.ood.storage;

import org.junit.jupiter.api.Test;
import ru.job4j.ood.storage.food.Bread;
import ru.job4j.ood.storage.food.Food;
import ru.job4j.ood.storage.food.Meat;
import ru.job4j.ood.storage.food.Milk;
import ru.job4j.ood.storage.store.Shop;
import ru.job4j.ood.storage.store.Store;
import ru.job4j.ood.storage.store.Trash;
import ru.job4j.ood.storage.store.Warehouse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ControlQualityTest {

    @Test
    void whenUseAllStore() {
        Store storeWare = new Warehouse();
        Store storeShop = new Shop();
        Store storeTrash = new Trash();
        Food milk = new Milk(
                "Milk",
                LocalDate.of(2024, 11, 26),
                LocalDate.of(2024, 11, 23),
                500.0);
        Food meat = new Meat(
                "Meat",
                LocalDate.of(2024, 11, 21),
                LocalDate.of(2024, 11, 16),
                1000.0);
        Food blackBread = new Bread(
                "blackBread",
                LocalDate.of(2024, 11, 25),
                LocalDate.of(2024, 11, 21),
                100.0);
        Food whiteBread = new Bread(
                "whiteBread",
                LocalDate.of(2024, 11, 24),
                LocalDate.of(2024, 11, 20),
                100.0);
        List<Store> stores = new ArrayList<>();
        stores.add(storeWare);
        stores.add(storeShop);
        stores.add(storeTrash);
        List<Food> foods = new ArrayList<>();
        foods.add(milk);
        foods.add(meat);
        foods.add(blackBread);
        foods.add(whiteBread);
        ControlQuality controlQuality = new ControlQuality();
        String dateToday = "2024-11-22";
        controlQuality.addForStores(foods, stores, dateToday);
        assertThat(milk).isEqualTo(storeWare.findByName("Milk"));
        assertThat(blackBread).isEqualTo(storeShop.findByName("blackBread"));
        assertThat(whiteBread).isEqualTo(storeShop.findByName("whiteBread"));
        assertThat(meat).isEqualTo(storeTrash.findByName("Meat"));
    }
}