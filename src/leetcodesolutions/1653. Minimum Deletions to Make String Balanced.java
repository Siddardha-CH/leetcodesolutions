You are given a string s consisting only of characters 'a' and 'b'​​​​.

You can delete any number of characters in s to make s balanced. s is 
balanced if there is no pair of indices (i,j) such that i < j and s[i] = 'b' and s[j]= 'a'.

Return the minimum number of deletions needed to make s balanced.



  -------------------------------------SOLUTION--------------------------------------




  class Solution {
    public int minimumDeletions(String s) {
        // int[] dp = new int[s.length()];
        // int c = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     dp[i] = c;
        //     if (s.charAt(i) == 'b')
        //         c += 1;
        // }
        // c = 0;
        // int ans = 9999999;
        // for (int i = s.length() - 1; i >= 0; i--) {
        //     dp[i] += c;
        //     ans = Math.min(ans,dp[i]);
        //     if (s.charAt(i) == 'a')
        //         c += 1;
        // }
        // return ans;
        int ans = 0;
        int count = 0;
        for (char c : s.toCharArray())
            if (c == 'b')
                count += 1;
            else if (count > 0) {
                count -= 1;
                ans += 1;
            }
        return ans;
    }
}
