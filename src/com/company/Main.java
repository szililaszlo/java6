package com.company;

import classes.Bird;
import classes.Mammal;
import classes.Reptile;

enum ORDER {MAX, MIN};

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 5, 8, 0, 3};


        Bird bird = new Bird();
        bird.move();
        System.out.println(bird.toString());

        Reptile reptile = new Reptile();
        reptile.move();
        System.out.println(reptile.toString());

        Mammal mammal = new Mammal();
        mammal.move();
        System.out.println(mammal.toString());

        Ameoba ameoba = new Ameoba();
        ameoba.drawBoard();

        System.out.println("----------------------");
        insertSort(array, ORDER.MAX);

        printArray(array);

    }

    public static void insertSort(int[] array, ORDER order) {
        for (int i = 1; i <= array.length - 1; i++) {
            int j = i;
            if (order == ORDER.MIN) {

                while (j > 0 && array[j] < array[j - 1]) {
                    int helper;
                    helper = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = helper;
                    --j;
                }
            } else {
                while (j > 0 && array[j] > array[j - 1]) {
                    int helper;
                    helper = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = helper;
                    --j;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
