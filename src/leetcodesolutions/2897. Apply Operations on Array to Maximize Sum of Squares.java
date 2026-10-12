You are given a 0-indexed integer array nums and a positive integer k.

You can do the following operation on the array any number of times:

Choose any two distinct indices i and j and simultaneously update the values of nums[i] to (nums[i] AND nums[j]) and nums[j] to (nums[i] OR nums[j]). Here, OR denotes the bitwise OR operation, and AND denotes the bitwise AND operation.
You have to choose k elements from the final array and calculate the sum of their squares.

Return the maximum sum of squares you can achieve.

Since the answer can be very large, return it modulo 109 + 7.





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
        #  Date        : 2026-12-10                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxSum(List<Integer> nums, int k) {
        int[] bits = new int[31];
        for (int i : nums) {
            int j = 0;
            while (i > 0) {
                bits[j] += (i % 2);
                i /= 2;
                j += 1;
            }            
        }
        int mod = 1000000007;
        long ans = 0;
        for (int i = 0; i < k; i++) {
            long a = 0;
            long c = 1;
            for (int j = 0; j < 31; j++) {
                if (bits[j] > 0) {
                    a += c;
                    bits[j] -= 1;
                }
                c *= 2;
            }
            a %= mod;
            ans = (ans + ((a * a) % mod)) % mod; 
        }
        return (int) ans;
    }
}
