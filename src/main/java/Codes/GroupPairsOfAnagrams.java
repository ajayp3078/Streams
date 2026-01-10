package Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupPairsOfAnagrams {
    public static void groupAnagrams(String[] arr){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : arr){
            char[] sortedArray = str.toCharArray();
            Arrays.sort(sortedArray);
            String sortedStr = new String(sortedArray);

            if(!map.containsKey(sortedStr)){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedStr,list);
            }
            else{
                map.get(sortedStr).add(str);
            }
        }
        System.out.println(map.values());
    }
    public static void usingFreqCount(String s1, String s2){
        int[] freq = new int[256];
        for(int i=0;i<s1.length();i++){

                    freq[s1.charAt(i)]++;
                    freq[s2.charAt(i)]--;
        }
        for(int i : freq) {
            if (i != 0) {
                System.out.println("No");
            }
        }
        System.out.println("Yes");
    }
    public static void usingArraysSort(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        String[] arr = {"pan","nap","tea","ate","listen"};
        usingArraysSort(s1,s2);
        usingFreqCount(s1,s2);
        groupAnagrams(arr);
    }

}
