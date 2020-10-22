package com.company;

public class eserciziomelvinriccardo {
    public static void main(String[] args) {
        int[] num= new int[]{1, 2, 3, 5, 7, 9};
        int trova = 8;
        for(int i=0; i< num.length; i++){
            if (num[i]==trova){
                System.out.println(i);
                return;
            }
        }System.out.println("-1");


    }
}
