package com.company;

public class eserciziomelvinriccardo2 {
    public static void main(String[] args) {
        int[] arrayint = new int[]{1, 2, 3, 5, 7, 9,10,12};
 /*       int num = 7;
        int inizio=0;
        int fine= arrayint.length;
*/
System.out.println(binaria(arrayint,11,0, arrayint.length));
    }
    public static int binaria (int []arrayint, int num, int inizio, int fine){
        int meta=(inizio+fine)/2;
        if (arrayint[meta]== num) {
            return meta;
        }if (inizio>=fine){
            return -1;
        }if (arrayint[meta] < num){
            return binaria (arrayint, num,meta+1, arrayint.length);
        }return binaria(arrayint,num,inizio,meta-1 );



    }
}
/*
inizio=0
fine= arr.length
se inizio == fine (elemento non trovato) stampa -1
se array[meta`]< trova{
return
 */