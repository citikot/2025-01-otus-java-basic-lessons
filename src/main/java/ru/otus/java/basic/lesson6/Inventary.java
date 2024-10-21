package ru.otus.java.basic.lesson6;

public class Inventary {
    String[] items = new String[5];

    public void add(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("В рюкзак был положен предмет: " + item);
                return;
            }
        }
        System.out.println("В рюкзаке нет места для предмета: " + item);
    }

    public int count() {
        int result = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                result++;
            }
        }
        return result;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.print(items[i] + " ");
                ;
            }
        }
        System.out.println("]");
    }

    public void drop(String item) {
        for (int i = 0; i < items.length; i++) {
            if (item.equals(items[i])) {
                items[i] = null;
                System.out.println("Из рюкзака мы выбросили предмет " + item);
                return;
            }
        }
        System.out.println("В рюкзаке нет предмета: " + item);
    }

    public void use(String item) {
        for (int i = 0; i < items.length; i++) {
            if (item.equals(items[i])) {
                items[i] = null;
                if (item.equals("хлеб")) {
                    System.out.println("Человек съел хлеб");
                } else if (item.equals("доска")) {
                    System.out.println("Человек прокатился на доске");
                } else {
                    System.out.println("Человек не знает как это использовать," +
                            " просто его выбросим");
                }
                return;
            }
        }
        System.out.println("В рюкзаке нет предмета " + item +
                " -> его нельзя использовать");
    }
}
