// Given an integer array nums, find the subarray with the largest sum, and return its sum.

___________________________________________________________________________________________________________________________________
-----------------------------------------------------------------------------------------------------------------------------------


  class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max + nums[i]);
            ans = Math.max(ans , max);
        }
        return ans;
    }
}
