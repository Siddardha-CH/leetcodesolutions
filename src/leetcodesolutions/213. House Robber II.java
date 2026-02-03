You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. 
All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. 
  Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two 
  adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.



  ----------------------------------------SOLUTION----------------------------------




class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length - 1];
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0],nums[1]);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length - 1; i++)
            dp[i] = Math.max(dp[i - 1],dp[i - 2] + nums[i]);
        int k = dp[nums.length - 2];
        dp[0] = nums[1];
        dp[1] = Math.max(nums[1],nums[2]);
        for (int i = 3; i < nums.length; i++) {
            dp[i - 1] = 0;
            dp[i - 1] = Math.max(dp[i - 2],dp[i - 3] + nums[i]);
        }
        return Math.max(k,dp[nums.length - 2]);
    }
}
