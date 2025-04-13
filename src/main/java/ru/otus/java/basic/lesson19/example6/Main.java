package ru.otus.java.basic.lesson19.example6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String data = " ADDED -> Hello World";
        byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
        try (FileOutputStream out = new FileOutputStream("src/main/java/ru/otus/java/basic/lesson19/example1/files/out.txt",true)) {
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
