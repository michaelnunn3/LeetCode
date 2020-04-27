// LeetCode Problem 1143: Longest Common Subsequence
// Source: https://leetcode.com/problems/longest-common-subsequence/discuss/351689/

// If running on LeetCode you must change class name to "Solution"

class LCSs {
    public int longestCommonSubsequence(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        
        for (int i = 0; i < s1.length(); ++i) {
            for (int j = 0; j < s2.length(); ++j) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                } 
                else {
                    dp[i + 1][j + 1] =  Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }
}