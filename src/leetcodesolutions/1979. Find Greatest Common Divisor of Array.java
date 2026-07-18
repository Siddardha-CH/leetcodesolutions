Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.





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
        #  Date        : 2026-07-17                                             #
        #                                                                       #
        #########################################################################
        */
    public int findGCD(int[] nums) {
        int min = 10000;
        int max = 0;
        for (int i : nums) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        while (min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }
        return max;
    }
}
