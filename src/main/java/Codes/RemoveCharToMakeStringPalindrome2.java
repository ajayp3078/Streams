package Codes;

public class RemoveCharToMakeStringPalindrome2 {
    public static void main(String[] args) {
        String s = "ujuj";
        if(findIndex(s)==-2){
            System.out.println("Already palindrome");
        }else if(findIndex(s)==-1){
            System.out.println("Not Possible");
        }
        else{
            System.out.println(findIndex(s));
        }
    }
    public static boolean isPalindrome(String s, int low, int high){
        while (low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public static int findIndex(String s){
        int low = 0;
        int high = s.length()-1;

        while(low<high){
            if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
            }
            else{
                if(isPalindrome(s,low+1,high)){
                    return low;
                }
                if(isPalindrome(s,low,high-1)){
                    return high;
                }
                return -1;
            }
        }
        // already palindrome
        return -2;
    }
}
