// Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) 
//   such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

__________________________________________________________________________________________________



  class Solution {
    public int arrayPairSum(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1 ; i += 2) {
            ans += Math.min(nums[i],nums[i + 1]);
        }
        return ans;
    }
}
