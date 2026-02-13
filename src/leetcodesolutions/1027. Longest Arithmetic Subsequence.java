Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.

Note that:

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
A sequence seq is arithmetic if seq[i + 1] - seq[i] are all the same value (for 0 <= i < seq.length - 1).




  --------------------------------------------SOLUTION--------------------------------------------




class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n  = nums.length;
        int[][] dp =new int[n][1001];
        int max = 2;
        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < i; j++) {
                int d = nums[i] - nums[j] + 500;
                dp[i][d] = Math.max(2,dp[j][d] + 1);
                max = Math.max(max,dp[i][d]);
            }
        return max;
    }
}
