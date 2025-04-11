package ru.otus.java.basic.lesson17;

public class MyArray {
    private String[] data;
    private int elementsCount;

    public MyArray(int capacity) {
        this.data = new String[capacity];
    }

    public void add(String in) {
        checkForOneNewElement();
        data[elementsCount] = in;
        elementsCount++;
    }

    public void clear() {
        elementsCount = 0;
    }

    public void add(int index, String in) {
        if (index > elementsCount) {
            throw new IllegalArgumentException("Нельзя добавить элемент, чтобы в списке оказалась дырка");
        }
        checkForOneNewElement();
        System.arraycopy(data, index, data, index + 1, elementsCount - index);
        data[index] = in;
        elementsCount++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= elementsCount) {
            throw new IllegalArgumentException("Нельзя заменить элемент, которого нет в списке");
        }
        System.arraycopy(data, index + 1, data, index, elementsCount - index - 1);
        elementsCount--;
        return true;
    }

    public boolean remove(String in) {
        for (int i = 0; i < elementsCount; i++) {
            if (data[i].equals(in)) {
                return remove(i);
            }
        }
        return false;
    }

    public void set(int index, String in) {
        if (index < 0 || index >= elementsCount) {
            throw new IllegalArgumentException("Нельзя заменить элемент, которого нет в списке");
        }
        data[index] = in;
    }

    public boolean contains(String in) {
        for (int i = 0; i < elementsCount; i++) {
            if (data[i].equals(in)) {
                return true;
            }
        }
        return false;
    }

    public String get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Нельзя запрашивать элемент с отрицательным индексом");
        }
        if (index >= elementsCount) {
            throw new IndexOutOfBoundsException("Нельзя запросить элемент, который не был добавлен");
        }
        return data[index];
    }

    public int size() {
        return elementsCount;
    }

    private void checkForOneNewElement() {
        if (elementsCount < data.length) {
            return;
        }
        int newSize = (int)(data.length * 1.5);
        if (data.length == newSize) {
            newSize++;
        }
        String[] temp = new String[newSize];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[ ");
        for (int i = 0; i < elementsCount; i++) {
            builder.append(data[i]).append(" ");
        }
        builder.append("]");
        return builder.toString();
    }
}