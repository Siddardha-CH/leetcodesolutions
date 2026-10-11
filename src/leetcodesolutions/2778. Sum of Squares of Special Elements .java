You are given a 1-indexed integer array nums of length n.

An element nums[i] of nums is called special if i divides n, i.e. n % i == 0.

Return the sum of the squares of all special elements of nums.




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
        #  Date        : 2026-11-10                                             #
        #                                                                       #
        #########################################################################
        */
    public int sumOfSquares(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length % (i + 1) == 0)
                ans += (nums[i] * nums[i]); 
        }
        return ans;
    }
}
