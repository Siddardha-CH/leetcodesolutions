You are given an integer array nums.

An array is considered alternating prime if:

Elements at even indices (0-based) are prime numbers.
Elements at odd indices are non-prime numbers.
In one operation, you may increment any element by 1.

Return the minimum number of operations required to transform nums into an alternating prime array.

A prime number is a natural number greater than 1 with only two factors, 1 and itself.



class Solution {
    public int minOperations(int[] nums) {
         /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-12                                             #
        #                                                                       #
        #########################################################################
        */
        int ans = 0;

        int m = 0;
        for (int i : nums)
            m = Math.max(m, i);

        int[] pnp = new int[m + 500];          // Array to Keep track of prime numbers

        for (int i = 2; i < m + 500; i++)       // As 0 and 1 are not prime
            pnp[i] = 1;

        for (int i = 2; i * i < m + 500; i++)      // Filling up the non-np numbers
            if (pnp[i] == 1)
                for (int j = i * i; j < m + 500; j += i)
                    pnp[j] = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (i % 2 == 0)                    // Prime Index
                while (pnp[n++] == 0)
                    ans += 1; 
            else                               //Non Prime Index
                while (pnp[n++] == 1)
                    ans += 1;
        }
        return ans;
    }
}
