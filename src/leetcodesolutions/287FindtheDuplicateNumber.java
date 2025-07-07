// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and using only constant extra space.

______________________________________________________________________________________________________________________
   ---------------------------------------------------------------------------------------------------------------


  class Solution {
    public int findDuplicate(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i : nums) {
            if (ans[i] == -11) {
                return i;
            }
            ans[i] = -11;
        }
        return 0;
    }
}
