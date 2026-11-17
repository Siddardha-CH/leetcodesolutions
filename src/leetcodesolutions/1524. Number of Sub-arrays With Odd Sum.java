Given an array of integers arr, return the number of subarrays with an odd sum.

Since the answer can be very large, return it modulo 109 + 7.






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
        #  Date        : 2026-17-11                                               #
        #                                                                       #
        #########################################################################
        */
    public int numOfSubarrays(int[] arr) {
        int even = 0;
        int odd = 0;
        long ans = 0;
        int mod = 1000000007;
        int n = arr.length;
        long sum = 0;
        for (int i : arr) {
            sum += i;
            if (sum % 2 == 1) {
                ans = (ans + even + 1) % mod;
                odd += 1; 
            }
            else {
                ans = (ans + odd) % mod;
                even += 1;
            }
        }
        return (int)ans;
    }
}
