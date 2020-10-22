package com.company;
import java.util.Scanner;
public class esercizio6 {



        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter string:");
            String a = sc.nextLine();
            stringReverse(a);
        }

        static void stringReverse(String s) {
        char[] s1= s.toCharArray();
        for(int i=s1.length-1;i>=0; i--){
            System.out.print(s1[i]);
        }
        }


}
