package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class esercizioandrea3 {
    public static void main(String[] args) {
        System.out.print("Inserisci n:");
        Scanner n = new Scanner(System.in);

        int n1 = n.nextInt();
        System.out.print("Inserisci m:");
        Scanner m = new Scanner(System.in);
        int m1 = m.nextInt()+1;// il +1 serve a moltiplicare *10 includendo *0
        int[] array = new int[m1];
        int molt = 0;


        for (int i = 0; i < array.length; i++) {
            if (i < m1) {
                array[i] = n1 * molt;
                molt++;

            }

        }System.out.println(Arrays.toString(array));
    }
}