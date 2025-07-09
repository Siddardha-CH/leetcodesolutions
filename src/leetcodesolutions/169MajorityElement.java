// // Given an array nums of size n, return the majority element.

// // The majority element is the element that appears more than ⌊n / 2⌋ times. 
// You may assume that the majority element always exists in the array.

_________________________________________________________________________________
   -------------------------------------------------------------------------


  class Solution {
    public int majorityElement(int[] nums) {
        int n = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if ((nums.length / 2) < n) {
                    return nums[i];
                }
                else {
                    n = 1;
                }
            }
            else {
                n += 1;
            }
        }
        return nums[nums.length - 1];
    }
}
