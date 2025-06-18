// Given a 0-indexed integer array nums, determine whether there exist two subarrays
// of length 2 with equal sum. Note that the two subarrays must begin at different indices.

// Return true if these subarrays exist, and false otherwise.

// A subarray is a contiguous non-empty sequence of elements within an array.

 class Solution {
    public boolean findSubarrays(int[] nums) {
        int[] ans = new int[nums.length - 1];
        for(int i = 0; i < nums.length-1; i++) {
            ans[i] = nums[i] + nums[i + 1];
        }
        Arrays.sort(ans);
        for (int i = 0; i < ans.length - 1; i++) {
            if (ans[i] == ans[i+1])
            return true;
        }
        return false;
    }
}
