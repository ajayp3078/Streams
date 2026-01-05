package Codes;

public class AnagramsOptimized {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(findAnagrams(s1,s2));

    }

    public static boolean findAnagrams(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        int[] count = new int[256];     // using frequency count

        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int c : count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}

/*
TC : O(N)
SC : O(1)
 */
