 package ru.otus.java.basic.lesson21.base.order;

public class ThreadOrderApp {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(2);
            }
        }).start();
    }
}
