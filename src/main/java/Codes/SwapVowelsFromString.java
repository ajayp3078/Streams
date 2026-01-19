package Codes;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SwapVowelsFromString {
    public static void usingTwoPointers(String s){
        int left = 0;
        int right = s.length()-1;

        char[] ch = s.toCharArray();

        while(left<right){
            if("aeiouAEIOU".indexOf(left)==-1){
                left++;
            }
            else if("aeiouAEIOU".indexOf(right)==-1){
                right--;
            }
            if(left<right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(ch));
    }
    public static void main(String[] args) {

        String s = "hello";
        // o/p : holle
        // identify and swap the vowels from string

        List<String> vowels = s.chars().mapToObj(x -> String.valueOf((char) x)).filter(x -> x.matches("[aeiouAEIOU]+")).collect(Collectors.toList());
        Collections.reverse(vowels);

        StringBuilder sb = new StringBuilder();
        int vowelIndex = 0;
        for(char c : s.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1){
                sb.append(vowels.get(vowelIndex++));
            }else{
                sb.append(c);
            }
        }
        System.out.println(sb);
        usingTwoPointers(s);

    }
}
