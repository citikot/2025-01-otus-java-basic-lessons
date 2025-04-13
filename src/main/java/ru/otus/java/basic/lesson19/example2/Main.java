package ru.otus.java.basic.lesson19.example2;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("src/main/java/ru/otus/java/basic/lesson19/example1/files/demo.txt")) {
            byte[] buf = new byte[64];
            int n = in.read(buf);
            System.out.println("READ = " + n);
            while (n > 0) {
                System.out.print(new String(buf, 0, n));
                n = in.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
