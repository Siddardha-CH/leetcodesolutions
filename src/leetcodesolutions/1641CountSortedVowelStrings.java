// Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.

// A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.


------------------------------------------



  class Solution {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n][5];
        for (int i = 0; i < 5; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < n ; i++) {
            dp[i][4] = 1;
            for (int j = 3; j >= 0; j--) {
                dp[i][j] = dp[i-1][j] + dp[i][j + 1];
            } 
        }
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            ans += dp[n-1][i];
        }
        return ans;
    }
}
