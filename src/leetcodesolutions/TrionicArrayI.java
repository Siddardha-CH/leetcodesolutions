// You are given an integer array nums of length n.

// An array is trionic if there exist indices 0 < p < q < n − 1 such that:

// nums[0...p] is strictly increasing,
// nums[p...q] is strictly decreasing,
// nums[q...n − 1] is strictly increasing.
// Return true if nums is trionic, otherwise return false.

// Note: Please do not copy the description during the contest to maintain the integrity of your submissions.

___________________________________________________________________________




  class Solution {
    public boolean isTrionic(int[] nums) {
        if (nums.length == 3) {
            return false;
        }
        int a = 0;
        for (int i = 0; i< nums.length - 1; i++) {
            if (nums[i] < nums [i + 1] && a == 0) {
                a++;
            }
            else if (nums[i] < nums [i + 1] && a == 1) {
                a = 1;
            }
            else if( nums[i] > nums [i + 1] && a == 1) {
                a++;
            }
            else if( nums[i] > nums [i + 1] && a == 2) {
                a = 2;
            }
            else if (nums[i] < nums[i + 1] && a == 2) {
                a ++;
            }
            else if (nums[i] < nums[i + 1] && a == 3) {
                a = 3;
            }
            else {
                return false;
            }
        }
        if (a == 3) {
            return true;
        }
        return false;
    }
}
