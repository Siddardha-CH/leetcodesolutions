You are given two integers n and t. Return the smallest number greater than or equal to n such that the product of its digits is divisible by t.




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
        #  Date        : 2026-08-06                                             #
        #                                                                       #
        #########################################################################
        */
    public int smallestNumber(int n, int t) {
        for (int i = n; i <= n * t; i++) {
            int k = 1;
            int num = i;
            while (num > 0) {
                int temp = num % 10;
                num /= 10;
                k *= temp; 
            }
            if (k % t == 0)
                return i;
        }
        return 0;
    }
}
