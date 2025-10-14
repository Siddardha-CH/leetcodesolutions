// Given an array nums of n integers and an integer k, determine whether there exist two 
// adjacent subarrays of length k such that both subarrays are strictly increasing. 
// Specifically, check if there are two subarrays starting at indices a and b (a < b), where:

// Both subarrays nums[a..a + k - 1] and nums[b..b + k - 1] are strictly increasing.
// The subarrays must be adjacent, meaning b = a + k.
// Return true if it is possible to find two such subarrays, and false otherwise.



-----------------------------------------SOL - 1 ------------------------------------

  class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int q = 2 * k;
        int i = 0;
        while (i + q <= nums.size()) {
            boolean b = true;
            boolean c = true;
            for (int j = i; j < i + k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    b = false;
                    break;
                }
            }
            if (b == true) {
                for (int j = i + k; j < i + q - 1; j++) {
                    if (nums.get(j) >= nums.get(j + 1)) {
                        c = false;
                        break;
                    }
                }
                if (c == true) {
                    return true;
                }
            }

            i += 1;
        }
        return false;
    }
}
