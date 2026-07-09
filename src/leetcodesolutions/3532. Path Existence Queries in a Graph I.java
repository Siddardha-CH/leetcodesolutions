You are given an integer n representing the number of nodes in a graph, labeled from 0 to n - 1.

You are also given an integer array nums of length n sorted in non-decreasing order, and an integer maxDiff.

An undirected edge exists between nodes i and j if the absolute difference between nums[i] and nums[j] is at most maxDiff (i.e., |nums[i] - nums[j]| <= maxDiff).

You are also given a 2D integer array queries. For each queries[i] = [ui, vi], determine whether there exists a path between nodes ui and vi.

Return a boolean array answer, where answer[i] is true if there exists a path between ui and vi in the ith query and false otherwise.





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
        #  Date        : 2026-07-09                                             #
        #                                                                       #
        #########################################################################
        */
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] grp = new int[n];
        int id = 0;
        grp[0] = id;
        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] > maxDiff)
                id += 1;
            grp[i] = id;
        }
        boolean[] ans = new boolean[queries.length];
        int idx = 0;
        for (int[] i : queries) {
            if (grp[i[0]] == grp[i[1]])
                ans[idx] = true;
            else
                ans[idx] = false;
            idx += 1;
        }
        return ans;
    }
}
