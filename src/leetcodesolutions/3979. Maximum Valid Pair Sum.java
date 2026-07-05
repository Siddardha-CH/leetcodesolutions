You are given an integer array nums of length n and an integer k.

A pair of indices (i, j) is called valid if:

0 <= i < j < n
j - i >= k
Return the maximum value of nums[i] + nums[j] among all valid pairs.





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
        #  Date        : 2026-07-05                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxValidPairSum(int[] nums, int k) {
        int i = 0;
        int j = k;
        int ans = 0;
        int m1 = 0;
        while (j < nums.length && j - i >= k) {
            m1 = Math.max(m1, nums[i]);
            ans = Math.max(ans, m1 + nums[j]);
            i += 1;
            j += 1;
        }
        i = nums.length - k - 1;
        j = nums.length - 1;
        m1 = 0;
        while (i >= 0 && j - i >= k) {
            m1 = Math.max(m1, nums[j]);
            ans = Math.max(ans, m1 + nums[i]);
            i -= 1;
            j -= 1;
        }
        return ans;
    }
}
