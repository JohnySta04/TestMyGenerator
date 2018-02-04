package com.brainacad.oop.testmygen;

public class Main {

    public static void main(String[] strings) {
        System.out.println("******************************************");
        System.out.println("Labwork 2.15.4");
        System.out.println("-------------------------------------------");

        MyNumGenerator myNumGenerator1 = new MyNumGenerator(10, 15);
        System.out.println(myNumGenerator1.generate().toString());
        System.out.println("******************************************");

        System.out.println("Labwork 2.15.5");
        System.out.println("-------------------------------------------");

        MyNumGenerator myNumGenerator2 = new MyNumGenerator(10, 20);
        System.out.println(myNumGenerator2.generateDistinct().toString());
        System.out.println("******************************************");

    }
}
