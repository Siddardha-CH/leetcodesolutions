// Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray). 
// The subsequence must be strictly increasing.

// A continuous increasing subsequence is defined by two indices l and r (l < r) such that it is [nums[l], nums[l + 1], ..., 
// nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].

 ________________________________________________________________________________________________________________________________________
   --------------------------------------------------------------------------------------------------------------------------------------


class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 0;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count += 1;
            }
            else {
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }
}
