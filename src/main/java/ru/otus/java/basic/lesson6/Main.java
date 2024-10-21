package ru.otus.java.basic.lesson6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventary inventary = new Inventary();
        String bread = "хлеб";
        String board = "доска";
        inventary.add(bread);
        inventary.print();
        inventary.add(board);
        System.out.println("inventary.count() = " + inventary.count());
        inventary.print();
        inventary.drop("хлеб");
        inventary.print();
        inventary.use("доска");
        inventary.print();
    }

    /**
     * @apiNote Поле чудес
     */
    private static void magicField() {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {
                "apple", "plum",
                "kiwi", "pear",
                "pineapple", "grape",
                "strawberry", "cherry",
                "banana", "orange"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(fruits.length);
        String wordToGuess = fruits[randomIndex];
        boolean win = false;
        System.out.print("Крутите барабан,");
        char[] result = new char[wordToGuess.length()];
        Arrays.fill(result, '*');

        while (!win) {
            System.out.println("Назовите букву :");
            char latter = scanner.next().charAt(0);
            char[] toGuess = wordToGuess.toCharArray();
            System.out.println("Слово : ");
            for (int i = 0; i < toGuess.length; i++) {
                if (toGuess[i] == latter) {
                    result[i] = latter;
                }
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
            }
            if (!containsStar(result)) {
                win = true;
                System.out.println("\n Вы победили!");
            }
            System.out.println();
        }
    }

    private static boolean containsStar(char[] result) {
        boolean flag = false;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == '*') {
                flag = true;
            }
        }
        return flag;
    }

    /**
     * @apiNote Игра - угадай слово
     */
    private static void playWorld() {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {
                "apple", "plum",
                "kiwi", "pear",
                "pineapple", "grape",
                "strawberry", "cherry",
                "banana", "orange"
        };
        int randomIndex = (int) (Math.random() * fruits.length);
        String wordToGuess = fruits[randomIndex];
        boolean win = false;
        System.out.println("Угадайте фрукт:");

        while (!win) {
            String inputFruit = scanner.next();
            if (wordToGuess.equals(inputFruit)) {
                System.out.println("Угадали!");
                win = true;
            } else {
                char[] toGuess = wordToGuess.toCharArray();
                char[] input = inputFruit.toCharArray();
                for (int i = 0; i < toGuess.length && i < input.length; i++) {
                    if (toGuess[i] == input[i]) {
                        System.out.print(input[i]);
                    } else {
                        System.out.print("*");
                    }
                }
                for (int i = 0; i < (11 - toGuess.length); i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    /**
     * @param array входной массив
     * @return максимальный эл-т массива
     */
    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * @param array входной массив
     * @return минимальный эл-т массива
     */
    private static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}