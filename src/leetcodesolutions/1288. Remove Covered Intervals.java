Given an array intervals where intervals[i] = [li, ri] represent the interval [li, ri), remove all intervals that are covered by another interval in the list.

The interval [a, b) is covered by the interval [c, d) if and only if c <= a and b <= d.

Return the number of remaining intervals.




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
        #  Date        : 2026-07-06                                             #
        #                                                                       #
        #########################################################################
        */
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            else
                return b[1] - a[1];
        });
        int p = intervals[0][1];
        int ans = 1;
        for (int i = 1; i < intervals.length; i++) {
            int[] k1 = intervals[i];
            if (k1[1] <= p)
                continue;
            ans += 1;
            p = k1[1];
        }
        return ans;
    }
}
