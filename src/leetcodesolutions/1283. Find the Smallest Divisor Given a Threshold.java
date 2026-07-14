Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.

Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

The test cases are generated so that there will be an answer.






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
        #  Date        : 2026-07-14                                             #
        #                                                                       #
        #########################################################################
        */
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = 0;
        int ans = Integer.MAX_VALUE;
        for (int i : nums)
            r = Math.max(i, r);
        while (r >= l) {
            int m = (l + r) / 2;
            int s = 0;
            for (int i : nums) {
                if (i % m != 0) {
                    s += 1;
                }
                s += (i / m);
            }
            if (s <= threshold) {
                ans = Math.min(ans, m);
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return ans;
    }
}
