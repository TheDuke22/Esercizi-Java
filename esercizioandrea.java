package com.company;
import java.util.Scanner;

public class esercizioandrea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci i secondi:");
        int secondi = sc.nextInt();
        tempo(secondi);
    }


        static void tempo ( int secondi){
            int min = 0;
            int ore = 0;
            int giorni = 0;
            while (true) {
                if (secondi <= 59) {
                    break;
                }
                if (secondi > 59) {
                    min++;
                    secondi = secondi - 60;
                }
                if (min > 59) {
                    ore++;
                    min = min - 60;

                }
                if (ore > 24) {
                    giorni++;
                    ore = ore - 24;
                }

            }
            System.out.println("secondi "+ secondi);
            System.out.println("min "+ min);
            System.out.println("ore "+ ore);
            System.out.println("giorni "+ giorni);
        }

    }

