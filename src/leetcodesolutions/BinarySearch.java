// Given an array of integers nums which is sorted in ascending order, 
//   and an integer target, write a function to search target in nums. 
//   If target exists, then return its index. Otherwise, return -1.

// You must write an algorithm with O(log n) runtime complexity.


_______________________________________________________________________________________________________________________________________
  --------------------------------------------------------------------------------------------------------------------------------------


class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r =  nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target ) {
                return mid;
            }
            else if (nums[mid] < target) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
