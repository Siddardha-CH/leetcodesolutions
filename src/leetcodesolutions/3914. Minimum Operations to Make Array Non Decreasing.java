You are given an integer array nums of length n.

In one operation, you may choose any subarray nums[l..r] and increase each element in that subarray by x, where x is any positive integer.

Return the minimum possible sum of the values of x across all operations required to make the array non-decreasing.

An array is non-decreasing if nums[i] <= nums[i + 1] for all 0 <= i < n - 1.





class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-26                                             #
        #                                                                       #
        #########################################################################
        */
    public long minOperations(int[] nums) {
        long ans = 0;

        int l = 0;
        while (l < nums.length - 1) {
            int r = l;

            while (r + 1 < nums.length && nums[r + 1] < nums[r]) {
                ans += nums[r] - nums[r + 1];
                r += 1;
            }

            l = r + 1;
        }
        return ans;
    }
}
