// You are given an integer array nums.

// The alternating sum of nums is the value obtained by adding elements at even indices 
// and subtracting elements at odd indices. That is, nums[0] - nums[1] + nums[2] - nums[3]...

// Return an integer denoting the alternating sum of nums.©leetcode


--------------------------------------------------------------


  class Solution {
    public int alternatingSum(int[] nums) {
        int ans = 0;
        boolean b = false;
        for (int i : nums) {
            if (b == false) {
                ans += i;
                b = true;
            }
            else {
                b =false;
                ans -= i;
            }
        }
        return ans;
    }
}©leetcode
