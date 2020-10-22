package com.company;

import java.util.Arrays;
import java.util.Random;

public class tombolarandom {
    public static void main(String[] args) {

        int usciti = 0;
        int riga0 = 0;
        int riga1 = 0;
        int riga2 = 0;
        int[] estratti = new int[20];                                              //usare stringa.index of(elemento)
        Random rand = new Random();
        int random = rand.nextInt(90);
        for(int i=0; i< estratti.length; i++){

        }
        int[][] cartella = new int[3][5];
        for (int i = 0; i < estratti.length; i++) {
            for (int riga = 0; riga < cartella.length; riga++) {
                for (int colonna = 0; colonna < cartella[riga].length; colonna++) {
                    if (estratti[i] == cartella[riga][colonna]) {
                        usciti++;
                        if (riga == 0) {
                            riga0++;
                        } else if (riga == 1) {
                            riga1++;
                        } else riga2++;

                    }

                }


            }
        }
        if (usciti == 15) {
            System.out.println("tombola!!");
        } else if (riga0 == 5) {
            System.out.println("cinquina nella prima riga");
        } else if (riga0 == 4) {
            System.out.println("quaterna nella prima riga");
        } else if (riga0 == 3) {
            System.out.println("terna nella prima riga");
        } else if (riga0 == 2) {
            System.out.println("ambo nella prima riga");
        }
        if (riga1 == 5 && riga0 < 5) {
            System.out.println("cinquina nella 2 riga");
        } else if (riga1 == 4 && riga0 < 4) {
            System.out.println("quaterna nella 2 riga");
        } else if (riga1 == 3 && riga0 < 3) {
            System.out.println("terna nella 2 riga");
        } else if (riga1 == 2 && riga0 < 2) {
            System.out.println("ambo nella 2 riga");
        }
        if (riga2 == 5 && riga1 < 5) {
            System.out.println("cinquina nella 3 riga");
        } else if (riga2 == 4 && riga1 < 4) {
            System.out.println("quaterna nella 3 riga");
        } else if (riga2 == 3 && riga1 < 3) {
            System.out.println("terna nella 3 riga");
        } else if (riga2 == 2 && riga1 < 2) {
            System.out.println("ambo nella 3 riga");
        }
    }
}
