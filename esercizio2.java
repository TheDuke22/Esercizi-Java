package com.company;
import java.util.Scanner;

public class esercizio2 {



    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter string:");
            String a = sc.nextLine();
            reverseString(a);
        }

        private static void reverseString(String s) {
            String[] split = s.trim().split(" ");
            for (int i = split.length-1; i >= 0; i--){
                System.out.print(split[i] + " ");
            }
        }


}