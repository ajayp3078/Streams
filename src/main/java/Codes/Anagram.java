package Codes;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);                  // O(n log n)
        Arrays.sort(arr2);                  // O(n log n)

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Is Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}

/*
TC : O(n log n)
SC : O(N)
 */

