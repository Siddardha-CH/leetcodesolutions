Given an integer array nums, find three numbers whose product is maximum and return the maximum product.







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
        #  Date        : 2026-07-26                                             #
        #                                                                       #
        #########################################################################
        */
    public int maximumProduct(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        int ma = Integer.MAX_VALUE;
        int mb = Integer.MAX_VALUE;

        for (int i : nums) {
            if (i > a) {
                c = b;
                b = a;
                a = i;
            }
            else if (i > b) {
                c = b;
                b = i;
            }
            else if (i > c) {
                c = i;
            }

            // min 2 elemnts

            if (i < ma) {
                mb = ma;
                ma = i;
            }
            else if (i < mb)
                mb = i;
        }
        return Math.max(a * b * c, a * ma * mb);
    }
}
