package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class esercizioandre4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter index:");
        int index =sc.nextInt();
        fibonacci(index);
    }

    static void fibonacci(int index) { //inserite il vostro codice qui
        int[] arr= new int[index];
        arr[0]=0;arr[1]=1;

        for (int i = 2; i < arr.length; i++){
            if (i< arr.length){
               arr[i]= arr[i-1]+arr[i-2];}






        }
       System.out.println(Arrays.toString(arr));
        System.out.println(("il 46esimo elemento e` ")+arr[45]);
    }
}

