package com.company;
import java.util.Scanner;
public class Main {



            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter a:");
                int a=sc.nextInt();
                System.out.print("Enter b:");
                int b=sc.nextInt();
                computeValues(a, b);
            }

            private static void computeValues(int a, int b) {
                int somma = (a+b);
                int moltiplicazione  = (a*b);
                int sottrazione = (a-b);
                int divisione = (a/b);
                System.out.println("il risultato della somma e`" + somma);
                System.out.println("il risultato e` moltiplicazione" + moltiplicazione);
                System.out.println("il risultato e` sottrazione" + sottrazione);
                System.out.println("il risultato e` divisione" + divisione);//inserite qui il vostro codice
            }
        }
