Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.

The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.








class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-06-11                                               #
        #                                                                       #
        #########################################################################
        */
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for (int i : arr1) {
            boolean b = true;
            for (int j : arr2) 
                if (Math.abs(i - j) <= d) {
                    b = false;
                    break;
                }
            if (b)
                ans += 1;
        }
        return ans;
    }
}
