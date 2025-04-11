package ru.otus.java.basic.lesson19.example1;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("src/main/java/ru/otus/java/basic/lesson19/example1/files/demo.txt")) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
