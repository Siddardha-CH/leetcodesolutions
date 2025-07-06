// You are given an integer array nums where the largest integer is unique.

// Determine whether the largest element in the array is at least twice as much as every 
// other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

________________________________________________________________________________________________________
  ---------------------------------------------------------------------------------------------------

  class Solution {
    public int dominantIndex(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a = Math.max(a, nums[i]);
        }
        int b = 0;
        int ans = 0;
        int c = 0;
        for (int i : nums) {
            if (i == a) {
                ans = c;
            }
            if (i * 2 > a) {
                b++;
            }
            c++;
        }
        if (b == 1) {
            return ans;
        }
        return -1;
    }
}
