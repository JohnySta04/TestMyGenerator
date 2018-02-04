package com.brainacad.oop.testmygen;

public class Main {

    public static void main(String[] strings) {
        System.out.println("******************************************");
        System.out.println("Labwork 2.15.4");
        System.out.println("-------------------------------------------");

        MyNumGenerator myNumGenerator = new MyNumGenerator(10, 100);
        System.out.println(myNumGenerator.generate().toString());
        System.out.println("******************************************");
    }
}
