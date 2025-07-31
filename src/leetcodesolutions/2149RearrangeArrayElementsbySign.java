// You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

// You should return the array of nums such that the the array follows the given conditions:

// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.
// Return the modified array after rearranging the elements to satisfy the aforementioned conditions.



class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int p = 0;
        int n = 0;
        for (int i : nums) {
            if (i > 0) {
                pos[p++] = i;
            }
            else {
                neg[n++] = i;
            }
        }
        int c = 0;
        for (int i = 0; i < pos.length; i++) {
            nums[c++] = pos[i];
            nums[c++] = neg[i];
        }
        return nums;
    }
}
