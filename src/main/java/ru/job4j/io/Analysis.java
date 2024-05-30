package ru.job4j.io;

import java.io.*;

public class Analysis {
    public void unavailable(String source, String target) {
        boolean flag = false;
        try (BufferedReader input = new BufferedReader(new FileReader(source));
             PrintWriter output = new PrintWriter(target)) {
            output.println(target.split("\\.")[1]);
            while (input.ready()) {
                String s = input.readLine();
                String[] buff = s.split(" ");
                if ((!flag && ("400".equals(buff[0]) || "500".equals(buff[0])))
                        || (flag && ("200".equals(buff[0]) || "300".equals(buff[0])))) {
                    String separator = !flag ? ";" : ";" + System.lineSeparator();
                    output.append(buff[1]).append(separator);
                    flag = !flag;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Analysis analysis = new Analysis();
        analysis.unavailable("data/server.log", "data/target.csv");
    }
}