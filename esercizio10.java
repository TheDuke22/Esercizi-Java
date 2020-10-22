package com.company;

public class esercizio10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("c"));
        System.out.println(isPalindrome("ciic"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(!isPalindrome("absca"));
        System.out.println(!isPalindrome("abbaa"));
        System.out.println(isPalindrome("zzzzz"));
        System.out.println(isPalindrome("zzczz"));
        System.out.println(isPalindrome("aabbaa"));
        System.out.println(isPalindrome("itopinonavevanonipoti"));
    }


        /*char[] s1= s.toCharArray();
        for(int i=s1.length-1;i>=0; i--){
            System.out.print(s1[i]);
        }*/
    private static boolean isPalindrome(String s) {
        String newS= "";
        char[] s1= s.toCharArray();
        for(int i=s1.length-1;i>=0; i--) {
            newS += (s1[i]);
        }
            if(s.equals(newS)){
                return true;
            }
            return false;
        }

 }

