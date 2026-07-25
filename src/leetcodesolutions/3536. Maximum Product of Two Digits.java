You are given a positive integer n.

Return the maximum product of any two digits in n.

Note: You may use the same digit twice if it appears more than once in n.





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
        #  Date        : 2026-07-25                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxProduct(int n) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        boolean a1 = false;
        boolean a2 = false;
        while (n > 0) {
            int t = n % 10;
            n /= 10;
            if (!a1) {
                a1 = true;
                max1 = t;
            }
            else if (a1 && !a2) {
                a2 = true;
                max2 = t;
            }
            else if (t >= max1 || t >= max2) {
                max2 = Math.max(max2, max1);
                max1 = t;
            } 
        }
        return max1 * max2;
    }
}
