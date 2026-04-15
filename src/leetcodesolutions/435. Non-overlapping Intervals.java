Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

Note that intervals which only touch at a point are non-overlapping. For example, [1, 2] and [2, 3] are non-overlapping.



class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-15                                             #
        #                                                                       #
        #########################################################################
        */
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1])); // SORTS ARRAY BASED ON END TIME

        int ans = 0;
        int prev = intervals[0][1];

        for (int i = 1; i < intervals.length; i++)
            if (prev > intervals[i][0])         // if merging then increase count
                ans += 1;
            else
                prev = intervals[i][1];             // update with end 
        
        return ans;
    }
}
