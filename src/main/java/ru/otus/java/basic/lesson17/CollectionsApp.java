package ru.otus.java.basic.lesson17;

import java.util.*;

public class CollectionsApp {
    public static void main(String[] args) throws Exception {
//        Box box = new Box(5,7,2,1);
//
//        List<String> list = new ArrayList<>(Arrays.asList("A","AB", "AAA", "D", "E", "AAC"));
//        list.removeIf(s -> s.length() == 1);
//
//        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,6,5,45,6,7,4,5));
//        l.removeIf(n -> n % 2 != 0);
//        System.out.println(l);
//
//        System.out.println(list);

        String[] x = {"A", "B", "C"};
        List<String> ls = Arrays.asList(x);
        ls.set(0, "Q");
        System.out.println(ls);
    }

    public static List<String> getData() {
        return Collections.unmodifiableList(new ArrayList<>(Arrays.asList("A", "B", "C")));
    }
}
