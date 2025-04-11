package ru.otus.java.basic.practice2;

import java.util.Scanner;

public class FieldOfGoldGame {
    public static void main(String[] args) {
        String aiWord = "aeroplane";
        //                                             0    1    2    3    4    5    6    7    8
        char[] aiWordArr = aiWord.toCharArray(); // [ 'a', 'e', 'r', 'o', 'p', 'l', 'a', 'n', 'e' ]
        // tablo  =                                 [ '*', '*', '*', '*', '*', '*', '*', '*', '*' ]
        char[] tablo = new char[aiWordArr.length];
        for (int i = 0; i < tablo.length; i++) {
            tablo[i] = '_';
        }
        printWord(tablo);
        System.out.println("Слово загадано. Игра началась. Пробуйте отгадать");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String answer = scanner.nextLine();
            if (answer.length() > 1) {
                if (answer.equals(aiWord)) {
                    System.out.println("Вы победили!");
                    break;
                }
                System.out.println("Неправильно!");
                continue;
            }
            char letter = answer.charAt(0);
            for (int i = 0; i < aiWordArr.length; i++) {
                if (aiWordArr[i] == letter) {
                    tablo[i] = letter;
                }
            }
            printWord(tablo);
        }
        System.out.println("Игра завершена");
    }

    public static void printWord(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
