package Codes;

public class PalindromeSentence {
    public static void main(String[] args) {
        String s = "my madam is super genius";
        System.out.println(countPalindromeWords(s));
    }
    public static int countPalindromeWords(String s){
        int count = 0;
        String[] words = s.split(" ");
        for(String word : words){
            if(isPalindrome(word)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPalindrome(String s){
        int j = 0;
        int k = s.length()-1;
        while(j<k){
            if(s.charAt(j)!=s.charAt(k)){
                return false;
            }
            j++;
            k--;
        }
        return true;
    }
}
