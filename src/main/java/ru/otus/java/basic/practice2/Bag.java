package ru.otus.java.basic.practice2;

public class Bag {
    String[] items = new String[5];
    int itemsCount;

    // 0 null
    // 1 null
    // 2 null
    // 3 null
    // 4 null

    public void add(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                itemsCount++;
                System.out.println("В сумку добавлен предмет: " + item);
                return;
            }
        }
        System.out.println("В сумке нет места для предмета: " + item);
    }

    public void clear() {
        System.out.println("Из сумки выкидываем предметы.");
        itemsCount = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println("Выброшено: " + items[i]);
                items[i] = null;
            }
        }
    }

    public void checkItem(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                System.out.println("Предмет " + item + " есть в сумке");
                return;
            }
        }
        System.out.println("Предмет " + item + " в сумке отсутствует");
    }

    public void info() {
        System.out.println("Сумка [" + itemsCount + " / " + items.length + "]:");
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(items[i]);
            } else {
                System.out.println("< Пусто >");
            }
        }
        System.out.println();
    }
}
