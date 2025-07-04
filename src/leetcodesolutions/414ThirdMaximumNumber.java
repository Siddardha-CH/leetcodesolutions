// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int c = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i + 1] != nums[i]) {
                c++;
            }

            if (c == 3) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
