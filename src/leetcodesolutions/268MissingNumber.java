// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.


--------------------------------------------------------------------------


  class Solution {
    public int missingNumber(int[] nums) {
        int[] n = new int[nums.length + 1];
        for (int i : nums) {
            n[i] = i;
        }
        int a = 0;
        for (int i : n) {
            if (a != i) {
                return a;
            }
            a += 1;
        }
        return 0;
    }
}
