You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.

Note that you don't need to modify intervals in-place. You can make a new array and return it.




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
        #  Date        : 2026-05-06                                             #
        #                                                                       #
        #########################################################################
        */

    public int[][] insert(int[][] intervals, int[] newI) {
        int n = intervals.length;
        ArrayList<ArrayList<Integer>> k = new ArrayList<>();

        for (int[] i : intervals) {
            ArrayList<Integer> l = new ArrayList<>();
            l.add(i[0]);
            l.add(i[1]);
            k.add(l);
        }
        boolean added = true;;
        for (int i = 0; i < n; i++) {
            int m = k.get(i).get(1);
            if (newI[0] <= m) {
                ArrayList<Integer> l = new ArrayList<>();
                l.add(newI[0]);
                l.add(newI[1]);
                k.add(i,l);
                added = false;
                break;
            }
        }

        if (added) {
            ArrayList<Integer> l = new ArrayList<>();
            l.add(newI[0]);
            l.add(newI[1]);
            k.add(l);            
        }
        int l = 0;
        while (l < k.size() - 1) {

            if (k.get(l).get(1) >= k.get(l + 1).get(0)) {
                k.get(l).set(0, Math.min(k.get(l).get(0), k.get(l + 1).get(0)));
                k.get(l).set(1, Math.max(k.get(l).get(1), k.get(l + 1).get(1)));
                k.remove(l + 1);
            }
            else 
                l += 1;
        }

        int[][] ans = new int[k.size()][2];

        for (int i = 0; i < k.size(); i++) {
            ans[i][0] = k.get(i).get(0);
            ans[i][1] = k.get(i).get(1);
        }
        return ans;
    }
}
