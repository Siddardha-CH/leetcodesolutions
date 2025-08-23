// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.


---------------------------------------------------------------------------------



  class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int n = nums.length;
        for (int k : nums) {
            if (k != 0) {
                nums[i ++] = k;
            }
        }
        for (int k = i; k < nums.length; k++) {
            nums[k] = 0;
        }
    }
}
