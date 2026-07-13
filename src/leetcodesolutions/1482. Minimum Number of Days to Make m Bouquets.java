You are given an integer array bloomDay, an integer m and an integer k.

You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.

The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.

Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.







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
        #  Date        : 2026-07-13                                             #
        #                                                                       #
        #########################################################################
        */
    public int minDays(int[] nums, int m, int k) {
        if (m * k > nums.length)
            return -1;
        int n = nums.length;
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i : nums) {
            l = Math.min(l, i);
            r = Math.max(r, i);
        }
        while (r >= l) {
            int mid = (l + r) / 2;
            int c = 0;
            int m1 = m;
            for (int i : nums) {
                if (i <= mid)
                    c += 1;
                else {
                    c = 0;
                }
                if (c >= k) {
                    c -= k;
                    m1 -= 1;
                }
            }
            if (m1 < 1) {
                r = mid - 1;
                ans = Math.min(ans, mid);
            }
            else 
                l = mid + 1;
        }
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
