package com.kenIT;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter random index in array: ");
        int x = scanner.nextInt();
        try{
            System.out.println("Index in array: " + x + " is: " +arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("index out of bound array");
        }
    }
}
