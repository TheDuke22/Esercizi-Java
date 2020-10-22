package com.company;
import java.util.Scanner;


public class esercizio {



        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number:");
            int number =sc.nextInt();
            checkEvenOdd(number);
        }

        private static void checkEvenOdd(int number) {
            if ( number % 2 ==0 ) {
                System.out.println("il numero e` pari");
            }    //inserite qui il vostro codice
        else{
            System.out.println("il numero e` dispari");
            }
    }
}
