// You are given a 0-indexed integer array nums and an integer k. Your task is to perform 
//   the following operation exactly k times in order to maximize your score:

// Select an element m from nums.
// Remove the selected element m from the array.
// Add a new element with a value of m + 1 to the array.
// Increase your score by m.
// Return the maximum score you can achieve after performing the operation exactly k times.

 _________________________________________________________________________________________________________________________________________
   --------------------------------------------------------------------------------------------------------------------------------------



class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = nums[nums.length - 1];
        int finalans = 0;
        for (int i = 0; i < k; i++) {
            finalans += ans + i;
        }
        return finalans;
    }
}
