You are given an integer array nums of length n, where nums is a permutation of the numbers in the range [1, n].

A XOR triplet is defined as the XOR of three elements nums[i] XOR nums[j] XOR nums[k] where i <= j <= k.

Return the number of unique XOR triplet values from all possible triplets (i, j, k).





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
        #  Date        : 2026-07-23                                             #
        #                                                                       #
        #########################################################################
        */
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        // all posiible combinations can be formed in that bit count of n if all bits are set not more than that and 1 and 2 dont comple this condition
        if (n < 3)
            return n;
        int ans = 1;
        while (n >= ans)
            ans *= 2;
        return ans;
    }
}
