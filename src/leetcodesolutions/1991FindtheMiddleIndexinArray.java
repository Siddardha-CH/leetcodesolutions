// Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

// A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

// If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

// Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

_____________________________________________________________________________________________________________________________________________________



  class Solution {
    public int findMiddleIndex(int[] nums) {
        if (nums.length == 1)
            return 0;
        int rsum = 0;
        for (int i : nums) {
            rsum += i;
        }
        int lsum = 0;
        for (int i = 0; i < nums.length ; i++ ) {
            rsum -= nums[i];
            if (rsum == lsum) {
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }
}
