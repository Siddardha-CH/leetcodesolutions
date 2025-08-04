// You are given an integer array nums.

// You are allowed to delete any number of elements from nums without making it empty. After performing the deletions, select a subarray of nums such that:

// All elements in the subarray are unique.
// The sum of the elements in the subarray is maximized.
// Return the maximum sum of such a subarray.


______________________________________________________________



  import java.util.Arrays;

class Solution {
    public int maxSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int ans = 0;
        
        if (nums[nums.length - 1] > 0) {
            ans += nums[nums.length - 1]; 
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] <= 0) {
                    break;
                }
                if (nums[i] != nums[i + 1]) {
                    ans += nums[i];
                }
            }
        } else {
            return nums[nums.length - 1];
        }
        return ans;
    }
}
 
