A cinema has n rows of seats, numbered from 1 to n. Each row has 10 seats, numbered from 1 to 10.

You are given a 2D integer array reservedSeats, where reservedSeats[i] = [rowi, seati] means that seat seati in row rowi is already reserved.

A four-person group must be assigned to four seats in the same row. The group can be seated in one of the following seat blocks:

seats 2, 3, 4, 5
seats 4, 5, 6, 7
seats 6, 7, 8, 9
A block can be used only if none of its seats are reserved. Each seat can be assigned to at most one group.

Return an integer denoting the maximum number of four-person groups that can be assigned.





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
        #  Date        : 2026-08-19                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxNumberOfFamilies(int n, int[][] res) {
        int ans = 0;
        Arrays.sort(res, (a,b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);
            else
                return Integer.compare(a[1], b[1]);
        });
        int res_rows = 0;
        int i = 0;
        while (i < res.length) {
            int r = res[i][0];
            res_rows += 1;
            boolean[] vis = new boolean[11];
            while (i < res.length && res[i][0] == r) {
                vis[res[i][1]] = true;
                i += 1;
            }
            boolean a = true;
            for (int j = 2; j < 6; j++)
                if (vis[j])
                    a = false;
            boolean b = true;
            for (int j = 4; j < 8; j++)
                if (vis[j])
                    b = false;
            boolean c = true;
            for (int j = 6; j < 10; j++)
                if (vis[j])
                    c = false;
            if (a && c)
                ans += 2;
            else if (a || b || c)
                ans += 1;
        }
        res_rows = n - res_rows;
        ans += (res_rows * 2);
        return ans;
    }
}
