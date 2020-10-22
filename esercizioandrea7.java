package com.company;

import java.util.Arrays;

public class esercizioandrea7 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 1,},
                {4, 3, 6,},
                {7, 8, 11,}};
        int somma = 0;

        if (somma<13) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == j) {
                        somma += arr[i][j];

                    }
                }

            }
            System.out.println(somma);
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i].length-i == arr[i].length-j) {
                        somma += arr[i][arr[i].length-1 - j];

                    }
                }
            }System.out.println(somma);
        }
    }
}