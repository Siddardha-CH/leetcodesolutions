Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.




class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-13                                             #
        #                                                                       #
        #########################################################################
        */


        int n = nums.length;
        int[] ans = new int[n];

        // SO WE PERFORM LEFT MUL  * RIGHT MUL SEPERATELY
        // ans[i] = product of elements before i * product of elements after i

        ans[0] = 1;

        for (int i = 1; i < n; i++)                     // LEFT PRODUCT 
            ans[i] = ans[i - 1] * nums[i -1];

        int j = 1;
        
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= j;                                // RIGHT PRODUCT TILL INDEX I
            j *= nums[i];
        }

        return ans;
    }
}
