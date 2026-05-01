You are given an integer array nums of length n.

Assume arrk to be an array obtained by rotating nums by k positions clock-wise. We define the rotation function F on nums as follow:

F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1].
Return the maximum value of F(0), F(1), ..., F(n-1).

The test cases are generated so that the answer fits in a 32-bit integer.






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
        #  Date        : 2026-05-01                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxRotateFunction(int[] nums) {
        int s = 0;
        int p = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            s += nums[i];               // calc sum of arr
            p += nums[i] * i;           // finding function at 0 i.e, F(0)
        }

        int ans = p;
        int c = p;

        for (int i = 1; i < n; i++) {
            c = (c + s) - (n * nums[n - i]);  // so here we are adding sum to F(i - 1) becuse all elements increase by 1 time and the 1st elemnt previosuly added n - 1 times and including sum it was added n times so we are subtarcting that 1st elemet by n times;
            ans = Math.max(ans, c);
        }

        return ans;
    }
}
