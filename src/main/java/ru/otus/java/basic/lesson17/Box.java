package ru.otus.java.basic.lesson17;

import java.util.Iterator;

public class Box implements Iterable<Integer> {
    private class BoxElementsIterator implements Iterator<Integer> {
        int cursor;

        public BoxElementsIterator() {
            this.cursor = -1;
        }

        @Override
        public boolean hasNext() {
            return cursor < 3;
        }

        @Override
        public Integer next() {
            cursor++;
            if (cursor == 0) {
                return a;
            }
            if (cursor == 1) {
                return b;
            }
            if (cursor == 2) {
                return c;
            }
            if (cursor == 3) {
                return d;
            }
            return 0;
        }

        @Override
        public void remove() {
            if (cursor == 0) {
                a = 0;
            }
            if (cursor == 1) {
                b = 0;
            }
            if (cursor == 2) {
                c = 0;
            }
            if (cursor == 3) {
                d = 0;
            }
        }
    }

    Integer a;
    Integer b;
    Integer c;
    Integer d;

    public Box(Integer a, Integer b, Integer c, Integer d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new BoxElementsIterator();
    }

    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
