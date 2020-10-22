package com.company;

public class esercizio4 {


    public static void main(String[] args) {
        String a = "ciao come va ?";
        String b = "cIao come vA ?";
        String c = "ciao come va ";
        System.out.println("2".equals("" + compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIaoo come vA ?";
        c = "ciao come va a";
        System.out.println("1".equals("" + compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIao come va ?";
        c = "ciao come vA ?";
        System.out.println("3".equals("" + compareStrings(a, b, c)));
    }

    private static int compareStrings(String a, String b, String c) {
       int count = 1;
        a.toLowerCase();
        b.toLowerCase();
        c.toLowerCase();
        if(a.equals(b)){

            count++;

        } else if (a.equals(c)){
            count++;

        }else if (b.equals(c)){
            count++;
        }


        return count;

    }

}