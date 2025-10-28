// You are given an integer array nums.

// Start by selecting a starting position curr such that nums[curr] == 0, and choose a movement direction of either left or right.

// After that, you repeat the following process:

// If curr is out of the range [0, n - 1], this process ends.
// If nums[curr] == 0, move in the current direction by incrementing curr if you are moving right, or decrementing curr if you are moving left.
// Else if nums[curr] > 0:
// Decrement nums[curr] by 1.
// Reverse your movement direction (left becomes right and vice versa).
// Take a step in your new direction.
// A selection of the initial position curr and movement direction is considered valid if every element in nums becomes 0 by the end of the process.

// Return the number of possible valid selections.


----------------------------------------------SOLUTION----------------------------------------------


  class Solution {
    public int countValidSelections(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int[] k1 = nums.clone();
                int[] k2 = nums.clone();
                if (validate_l(k1, i)) {
                    ans += 1;
                }
                if (validate_r(k2, i)) {
                    ans += 1;
                }
            }
        }
        return ans;
    }

    boolean validate_l(int[] nums, int index) {
        int d = -1;
        while (index >= 0 && index < nums.length) {
            if (nums[index] == 0) {
                index += d;
                continue;
            } else {
                nums[index] -= 1;
                d *= -1;
                index += d;
            }

        }
        for (int i : nums) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    boolean validate_r(int[] nums, int index) {
        int d = 1;
        while (index >= 0 && index < nums.length) {
            if (nums[index] == 0) {
                index += d;
                continue;
            } else {
                nums[index] -= 1;
                d *= -1;
                index += d;
            }
        }
        for (int i : nums) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

