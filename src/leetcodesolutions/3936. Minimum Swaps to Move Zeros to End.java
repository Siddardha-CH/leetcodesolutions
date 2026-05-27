You are given an integer array nums.

In one operation, you can choose any two distinct indices i and j and swap nums[i] and nums[j].

Return an integer denoting the minimum number of operations required to move all 0s to the end of the array.



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
        #  Date        : 2026-05-27                                             #
        #                                                                       #
        #########################################################################
        */
    public int minimumSwaps(int[] nums) {
        int c = 0;
        for (int i : nums)
            if (i == 0)
                c += 1;
        int ans = c;
        for (int i = nums.length - 1; i >= nums.length - c; i--)
            if (nums[i] == 0)
                ans -= 1;
        return ans;
    }
}
