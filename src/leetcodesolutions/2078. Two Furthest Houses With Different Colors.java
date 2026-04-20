There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.

Return the maximum distance between two houses with different colors.

The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.

 



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
        #  Date        : 2026-04-20                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxDistance(int[] colors) {
        int ans = 0;
        int n = colors.length;
        int l = 0;
        int r = n - 1;
        while (l != r) {
            if (colors[l] != colors[r])
                ans = Math.max(ans, r - l);
            l += 1;
        }
        l = 0;
        r = n -1;
        while (l != r) {
            if (colors[l] != colors[r])
                ans = Math.max(ans, r - l);
            r -= 1;
        }

        return ans;
    }
}
