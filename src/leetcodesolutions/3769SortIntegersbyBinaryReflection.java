// You are given an integer array nums.

// The binary reflection of a positive integer is defined as the number obtained by reversing the order of its binary digits (ignoring any leading zeros) and interpreting the resulting binary number as a decimal.

// Sort the array in ascending order based on the binary reflection of each element. If two different numbers have the same binary reflection, the smaller original number should appear first.

// Return the resulting sorted array.


_____________________________________SOLUTION____________________________________



  class Solution {
    public int[] sortByReflection(int[] nums) {
         int n  = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n- 1; j++) {
                String k1 = Integer.toBinaryString(nums[j]);
                String k2 = new StringBuilder(k1).reverse().toString();
                int a = Integer.parseInt(k2,2);
                 k1 = Integer.toBinaryString(nums[j + 1]);
                 k2 = new StringBuilder(k1).reverse().toString();
                int b = Integer.parseInt(k2,2);
                if (a > b || (a == b && nums[j] > nums[j + 1])) {
                    int t = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = t;
                }
            }
        }
        return nums;
    }
}
