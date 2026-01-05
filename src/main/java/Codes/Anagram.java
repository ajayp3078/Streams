package Codes;

import java.util.Arrays;
import java.util.stream.Collectors;

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

        // using streams
        String s1Mod = Arrays.stream(s1.split("")).sorted().collect(Collectors.joining());
        String s2Mod = s2.chars().mapToObj(x -> String.valueOf((char) x)).sorted().collect(Collectors.joining());
        if(s1Mod.equals(s2Mod)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}

/*
TC : O(n log n)
SC : O(N)
 */

