package com.brainacad.oop.testmygen;

import java.util.*;
import java.util.Random;

public class MyNumGenerator {

    private int numOfElm = 0;
    private int maxNumb = 0;

    public MyNumGenerator(int numOfElm, int maxNumb) {

        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List<Integer> generate() {
        List<Integer> integerList = new ArrayList<Integer>();
        Random randomGenerator = new Random();

        for (int i = 0; i < this.numOfElm; i++) {
            integerList.add(randomGenerator.nextInt(this.maxNumb));
        }

        return integerList;
    }
}
