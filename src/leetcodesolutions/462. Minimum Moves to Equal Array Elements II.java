Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

In one move, you can increment or decrement an element of the array by 1.

Test cases are designed so that the answer will fit in a 32-bit integer.







class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-02-11                                               #
        #                                                                       #
        #########################################################################
        */
    public int minMoves2(int[] nums) {
        int n = nums.length;
         n  = n / 2;
        Arrays.sort(nums);
        int median = nums[n];
        int ans = 0;
        for (int i : nums)
            ans += Math.abs(i - median);
        return ans;
    }
}
