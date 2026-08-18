You are given an integer array nums and an integer k.

An integer x is almost missing from nums if x appears in exactly one subarray of size k within nums.

Return the largest almost missing integer from nums. If no such integer exists, return -1.

A subarray is a contiguous sequence of elements within an array.





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
        #  Date        : 2026-08-18                                             #
        #                                                                       #
        #########################################################################
        */
    public int largestInteger(int[] nums, int k) {
        int[] cnt = new int[51];
        for (int i = 0; i <= nums.length - k; i++) {
            boolean[] b = new boolean[51];
            for (int j = i; j < i + k; j++) {
                if (!b[nums[j]]) {
                    cnt[nums[j]] += 1;
                    b[nums[j]] = true;
                }
            }
        }
        for (int i = cnt.length - 1; i >= 0; i--)
            if (cnt[i] == 1)
                return i;
        return -1;

    }
}
