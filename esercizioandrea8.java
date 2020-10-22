package com.company;

import java.util.Arrays;

public class esercizioandrea8 {
    public static void main(String[] args) {
        int[][] cartella = {
                {1, 19, 25, 55, 61},
                {8, 10, 22, 69, 88},
                {7, 15, 39, 77, 90}};
        int[] estratti = {1, 2, 5, 6, 8, 10, 22, 32, 44, 55, 61, 66, 69, 77, 80, 84, 88, 90, 11, 75};
        System.out.println(Arrays.toString(estratti));
        int usciti = 0;
        int riga0 = 0;
        int riga1 = 0;
        int riga2 = 0;
        for (int i = 0; i < estratti.length; i++) {
            for (int riga = 0; riga < cartella.length; riga++) {
                for (int colonna = 0; colonna < cartella[riga].length; colonna++) {
                    if (estratti[i] == cartella[riga][colonna]) {
                        usciti++;
                        if(riga==0){
                            riga0++;
                        }else if(riga==1){
                            riga1++;
                        }else riga2++;
                    }
                }
            }
        }
       if(usciti==15){
           System.out.println("tombola!!");}
       else {
           if (riga0 == 5) {
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
}
