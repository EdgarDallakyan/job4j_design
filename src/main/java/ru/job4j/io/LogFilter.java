package ru.job4j.io;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class LogFilter {
    private final String file;
    public LogFilter(String file) {
        this.file = file;
    }
    public List<String> filter() {
        List<String> rsl = new ArrayList<>();
        try (BufferedReader input = new BufferedReader(new FileReader(file))) {
            for (String line = input.readLine(); line != null; line = input.readLine()) {
                String[] str = line.split(" ");
                if (("404").equals(str[str.length - 2])) {
                    rsl.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rsl;
    }

    public static void main(String[] args) {
        LogFilter logFilter = new LogFilter("data/log.txt");
        logFilter.filter().forEach((System.out::println));
    }
}