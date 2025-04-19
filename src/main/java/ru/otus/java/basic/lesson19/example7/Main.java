package ru.otus.java.basic.lesson19.example7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String data = " QQQQ!!!";
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("src/main/java/ru/otus/java/basic/lesson19/example1/files/out.txt", true))) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
