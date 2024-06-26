package ru.job4j.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsageLog4j {

    private static final Logger LOG = LoggerFactory.getLogger(UsageLog4j.class.getName());

    public static void main(String[] args) {
        String name = "Edward Snow";
        int age = 28;
        char gender = 'm';
        double weight = 69.8;
        float height = 179.9F;
        boolean active = true;
        long number = 3478523570L;
        byte value = 99;
        short category = 1;
        LOG.debug("User info name : {}, age : {}, gender : {}, weight : {}, height : {}, active : {}, number : {}, value : {}, category : {}",
                name, age, gender, weight, height, active, number, value, category);
    }
}