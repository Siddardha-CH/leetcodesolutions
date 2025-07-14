// Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

// The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

______________________________________________________________________________________________________________________


  class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length - 1];
        for (int i = b; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 0;
    }
}
