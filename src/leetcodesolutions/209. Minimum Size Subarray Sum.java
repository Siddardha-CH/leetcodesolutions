Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.





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
        #  Date        : 2026-05-02                                             #
        #                                                                       #
        #########################################################################
        */
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;

        int l = 0;
        int sum = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while (sum >= target) {
                ans = Math.min(ans, r - l + 1);
                sum -= nums[l];
                l += 1;
            }
        }

        if (ans == Integer.MAX_VALUE)
            return 0;
        return ans;
    }
}
