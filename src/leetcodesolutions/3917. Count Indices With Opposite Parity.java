You are given an integer array nums of length n.

The score of an index i is defined as the number of indices j such that:

i < j < n, and
nums[i] and nums[j] have different parity (one is even and the other is odd).
Return an integer array answer of length n, where answer[i] is the score of index i




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
        #  Date        : 2026-05-03                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int c = 0;
            if (nums[i] % 2 == 0) {
                for (int j = i + 1; j < n; j++)
                    if (nums[j] % 2 == 1)
                        c += 1;
            }
            else {
                for (int j = i + 1; j < n; j++)
                    if (nums[j] % 2 == 0)
                        c += 1;
            }

            ans[i] = c;
        }
        return ans;
    }
}
