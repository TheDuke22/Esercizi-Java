package com.company;
import java.util.Scanner;
public class esercizio3 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a=sc.nextLine();
        System.out.print("Enter string:");
        String b=sc.nextLine();
        System.out.print("Enter string:");
        String c=sc.nextLine();
        replaceIntruder(a, b, c);
    }

    private static void replaceIntruder(String a, String b , String c) {
       String[] d = c.split(" ");
       d[1] = d[1].replaceAll (a, b);
       String frase = "";
       for( int i = 0; i<d.length; i++) {
        frase += d[i]+ " ";


       }
        System.out.println(frase);
    }


}
