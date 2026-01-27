package Codes;

public class RemoveCharToMakeStringPalindrome {
    public static void main(String[] args) {
        // using two pointers
        String s = "lilj";
        removeSingleCharForPalindrome(s);
    }
    public static boolean isPalindrome(String s, int low, int high){
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public static void removeSingleCharForPalindrome(String s){
        int low = 0;
        int high = s.length()-1;

        while(low<high){
            if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
            }else{
                if(isPalindrome(s,low+1,high)){
                    System.out.println(low);
                    return;
                }
                else if(isPalindrome(s,low,high-1)){
                    System.out.println(high);
                    return;
                }
                System.out.println("-1");
                return;
            }
        }
        System.out.println("Already Palindrome");
    }
}
