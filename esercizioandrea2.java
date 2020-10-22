package com.company;
import java.util.Arrays;
public class esercizioandrea2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = clona(array1);

        System.out.print(Arrays.toString(array2));
    }

        static int[] clona(int[] n){
            int[] copia= new int[n.length];
            for(int i=0;i<n.length;i++){
                if (n[i]%2 !=0){
                    copia[i]=n[i]*2;}

                    else copia[i]= n[i];

                }
            return copia;
            }
        }



