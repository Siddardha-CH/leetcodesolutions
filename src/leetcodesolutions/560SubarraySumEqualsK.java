// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

--------------------------------------------------------------------------------



  class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            int c =  nums[i];
            if (c == k) {
                    ans += 1;   
                }
            
                for (int j = i + 1; j < nums.length ; j ++) {
                c += nums[j];
                if (c == k) {
                    ans += 1;   
                }
            } 
        }
        return ans ;
    }
}
