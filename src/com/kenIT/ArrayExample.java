package com.kenIT;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer [] arrayInteger = new Integer[100];
        System.out.println("List array: ");
        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = random.nextInt(100);
            System.out.print(arrayInteger[i] + " ");
        }
        return arrayInteger;
    }
}
