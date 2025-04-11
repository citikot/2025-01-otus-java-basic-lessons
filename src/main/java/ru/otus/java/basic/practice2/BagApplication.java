package ru.otus.java.basic.practice2;

public class BagApplication {
    public static void main(String[] args) {
        Bag redBag = new Bag();
        redBag.add("Red Cube");
        redBag.add("Red Sphere");

        Bag greenBag = new Bag();
        greenBag.add("Scroll I");
        greenBag.add("Scroll II");
        greenBag.add("Scroll III");
        greenBag.add("Scroll IV");
        greenBag.add("Scroll V");

        Bag blueBag = new Bag();
        blueBag.add("Milk");
        blueBag.add("Bread");
        blueBag.add("Cheese");

        redBag.info();
        greenBag.info();
        blueBag.info();
        redBag.clear();
        redBag.info();
    }


}
