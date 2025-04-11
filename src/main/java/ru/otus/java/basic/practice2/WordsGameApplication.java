package ru.otus.java.basic.practice2;

import java.util.Scanner;

public class WordsGameApplication {
    public static void main(String[] args) {
        wordsGame();
    }

    private static void wordsGame() {
        String[] words = {
                "apple", "orange", "bananas", "peach", "strawberry", "tomato", "cucumber",
                "carrot", "pineapple"
        };
        String aiWord = words[(int)(Math.random() * words.length)];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Компьютер загадал слово на тему 'фрукты или овощи'. Попробуйте отгадать");
        while (true) {
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals(aiWord)) {
                System.out.println("Правильно!");
                break;
            }
            System.out.println("Неправильно");
            char[] aiWordArr = aiWord.toCharArray();
            char[] answerArr = answer.toCharArray();
            for (int i = 0; i < 20; i++) {
                if (i < aiWordArr.length && i < answerArr.length && aiWordArr[i] == answerArr[i]) {
                    System.out.print(aiWordArr[i]);
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
        System.out.println("Игра завершена");
    }

    private static void findMaxAndPrint() {
        int[] arr = {-2, -5, -1000};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}
