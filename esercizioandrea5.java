package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class esercizioandrea5 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter string a:");
    String a = sc.nextLine();
    System.out.print("Enter string b:");
    String b =sc.nextLine();
    anagrams(a, b);
}

static void anagrams(String a, String b) {
//String uno= a.replace(" ", "");
//String due= b.replace(" ", "");
String uno= a;
String due= b;
char arr1[]=uno.toLowerCase().toCharArray();
char arr2[]=due.toLowerCase().toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
if (Arrays.equals(arr1,arr2)){
    System.out.println("sono anagrammi");
}
else {
    System.out.println("non sono anagrammi");
}

System.out.println(Arrays.toString(arr1));
System.out.println(Arrays.toString(arr2));
    }

}
