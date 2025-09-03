// You are given a sorted array consisting of only integers where every element 
// appears exactly twice, except for one element which appears exactly once.

// Return the single element that appears only once.

// Your solution must run in O(log n) time and O(1) space.

----------------------------------------------------------------


  class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (m % 2 == 1) {
                m -= 1;
            }
            if (nums[m] == nums[m + 1]) {
                l = m + 2;
            }
            else {
                r = m;
            }
        }
        return nums[l];
    }
}
