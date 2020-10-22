package com.company;
import com.sun.jdi.IntegerValue;
import java.util.Arrays;
import java.util.Scanner;


public class esercizioandrea6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine();
        int[] values = parseNumbers(a);
        computeMinAndMax(values);
    }




    static int[] parseNumbers(String s) {
        String num[] = s.split(",");
        int[] interi = new int[num.length];//inserite qui il vostro codice
        for (int i = 0; i < num.length; i++) {
            interi[i] = Integer.parseInt(num[i]);
            //interi[i] = Integer.valueOf(num[i]);

        }System.out.println(Arrays.toString(interi));
        return interi;
    }

  private static void computeMinAndMax(int[] values) {
      Arrays.sort(values);
      System.out.println(Arrays.toString(values));


      reverse(values);
      System.out.println(Arrays.toString(values));
  }
   public static void reverse(int[] input){
       int last= input.length-1;
       int middle= input.length/2;
       for(int x=0; x<=middle; x++){
           int temp= input[x];
           input[x]= input[last-x];
           input[last-x]= temp;

       }

            }
    /*public static void reverse(int[] input){
        int min= 0;
        int mas=input.length-1;
        int [] massi= new int [mas];
        while (min < mas){
         input[min] = massi[mas];
         min++;
         mas--;
        }
    }
   /*int max[]= new int[values.length];
   for(int x=0; x<values.length; x++){
       for(int i=values.length-1; i>=0 ;i--)
           //max[x] = values[i];
           //System.out.println(x);
       System.out.println(values.length);
   }//System.out.println(Arrays.toString(max));
*/
    }


