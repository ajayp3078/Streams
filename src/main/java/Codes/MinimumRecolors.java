package Codes;

public class MinimumRecolors {
    public static void main(String[] args) {
        // ----- Minimum number of recolors required -----
        // Input: blocks = "WBBWWBBWBW", k = 7
        //Output: 3
        //Explanation:
        //One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
        //so that blocks = "BBBBBBBWBW".
        //It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
        //Therefore, we return 3.
        String s = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimumRecolors(s,k));
    }

    // BruteForce
    private static int minimumRecolors(String s, int k) {
        int minCount = Integer.MAX_VALUE;
        for(int i=0;i<=s.length()-k;i++){
            int count = 0;
            for(int j=i;j<i+k;j++){
                char c = s.charAt(j);
                if(c=='W'){
                    count++;
                }
            }
            minCount = Math.min(minCount,count);
        }
        return minCount;
    }
}

// TC : O(n*k)
// SC : O(1)
