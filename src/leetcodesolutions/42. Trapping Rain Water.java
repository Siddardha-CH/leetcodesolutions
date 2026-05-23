Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.




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
        #  Date        : 2026-05-23                                             #
        #                                                                       #
        #########################################################################
        */
    public int trap(int[] height) {

        //TLE

        // int ans = 0;
        // int n = height.length;
        // for (int i = 1; i < n - 1; i++) {
        //     int curr = i - 1;
        //     int lmax = i;
        //     while (curr >= 0) {
        //         if (height[curr] > height[lmax])
        //             lmax = curr;
        //         curr -= 1;
        //     }
        //     curr = i + 1;
        //     int rmax = i;
        //     while (curr < n) {
        //         if (height[curr] > height[rmax])
        //             rmax = curr;
        //         curr += 1;
        //     }
        //     int k = Math.min(height[rmax], height[lmax]) - height[i];
        //     if (k > 0)
        //         ans += k;
        // }
        // return ans;


        int n = height.length;
        int l = 0;
        int r = n - 1;
        int ans = 0;
        int lmax = 0;
        int rmax = 0;

        while (r > l) {
            if (height[r] > height[l]) {
                if (height[l] > lmax)
                    lmax = height[l];
                else
                    ans += lmax - height[l];
                l += 1;
            }
            else {
                if (height[r] > rmax)
                    rmax = height[r];
                else
                    ans += rmax - height[r];
                r -= 1; 
            }
        }
        return ans;
    }
}
