// You are given an integer array nums.

// Return the bitwise OR of all even numbers in the array.

// If there are no even numbers in nums, return 0.

-----------------------------------------------------


  class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                ans |= i;
            }
        }
        return ans;
    }
}
