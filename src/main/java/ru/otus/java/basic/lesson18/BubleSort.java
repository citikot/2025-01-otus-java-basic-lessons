package ru.otus.java.basic.lesson18;

import ru.otus.java.basic.lesson18.util.Measure;

public class BubleSort {

    Measure measure = new Measure();
    static final int ARR_SIZE = 100_000;

    public static void main(String[] args) {
        int[] array = new int[ARR_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
//        printArray(array);
        Measure.stamp();
        directSort(array);
        Measure.print();
//        printArray(array);

        array = new int[ARR_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

//        printArray(array);
        Measure.stamp();
        bubbleSort(array);
        Measure.print();
//        printArray(array);

    }

    private static void directSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            if (minPosition != i) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] array) {
        int j = 0;
        do {
            for (int i = j; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            j++;
        } while (j < array.length - 1);
    }
}
