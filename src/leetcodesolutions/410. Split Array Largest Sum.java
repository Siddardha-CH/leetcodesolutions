Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.






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
        #  Date        : 2026-06-19                                             #
        #                                                                       #
        #########################################################################
        */
    public int splitArray(int[] nums, int k) {
        int high = 0;
        int low = 0;
        for (int i : nums) {
            low = Math.max(low, i);
            high += i;
        }
        while (high >= low) {
            int mid = (high + low) / 2;
            int p = func(nums, mid);
            if (p > k) 
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    public int func(int[] nums, int range) {
        int c = 1;
        int s = 0;
        for (int i : nums) {
            if (s + i <= range)
                s += i;
            else {
                c += 1;
                s = i;
            }
        }
        return c;
    }
}
