Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).




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
        #  Date        : 2026-07-27                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxProduct(int[] nums) {
        int m1 = 0;
        int m2 = 0;
        for (int i : nums) {
            if (i - 1 > m1) {
                m2 = m1;
                m1 = i - 1;
            }
            else if (i - 1 > m2) 
                m2 = i - 1;
        }
        return m1 * m2;
    }
}
