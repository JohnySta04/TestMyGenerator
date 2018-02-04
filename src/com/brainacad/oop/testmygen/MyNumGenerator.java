package com.brainacad.oop.testmygen;

import java.util.*;
import java.util.Random;

public class MyNumGenerator {

    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {

        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List<Integer> generate() {
        List<Integer> integerList = new ArrayList<>();
        Random randomGenerator = new Random();

        while (integerList.size() < this.numOfElm) {
            integerList.add(randomGenerator.nextInt(this.maxNumb));
        }

        return integerList;
    }

    public Set<Integer> generateDistinct() {
        Set<Integer> integerSet = new HashSet<>();
        Random randomGenerator = new Random();

        while (integerSet.size() < this.numOfElm) {
            integerSet.add(randomGenerator.nextInt(this.maxNumb));
        }
        return integerSet;
    }
}
