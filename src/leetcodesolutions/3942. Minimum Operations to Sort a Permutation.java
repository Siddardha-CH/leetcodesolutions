You are given an integer array nums of length n, where nums is a permutation of the integers from 0 to n - 1.

You may perform only the following operations:

Reverse the entire array.
Rotate Left by One: Move the first element to the end of the array, and rest elements to left by one position.
Return an integer denoting the minimum number of operations required to sort the array in increasing order. If it is not possible to sort the array using only the given operations, return -1.






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
        #  Date        : 2026-22-10                                               #
        #                                                                       #
        #########################################################################
        */
    public int minOperations(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 0;
        int s = n * 2;
        int[] k = new int[s];
        for (int i = 0; i < s; i++)
            k[i] = nums[i % n];
        int ans = func (k); // og order
        for (int i = 0; i < s / 2; i++) {
            int temp = k[i];
            k[i] = k[s - i - 1];
            k[s - i - 1] = temp;
        }
        ans = Math.min(ans, func(k) + 1); // + 1 as we are ratating the array
        if (ans == Integer.MAX_VALUE - 1)
            return -1;
        return ans;
    }
    int func (int[] k) {
        int s = k.length;
        int n = s / 2;
        int cnt = 1;
        // increasing
        for (int i = 1; i < s; i++)
            if (k[i] < k[i - 1])
                cnt = 1;
            else {
                cnt += 1;
                if (cnt == n)
                    return i - n + 1;
            }
        // decreasing 
        cnt = 1;
        for (int i = 1; i < s; i++)
            if (k[i] > k[i - 1])
                cnt = 1;
            else {
                cnt += 1;
                if (cnt == n)
                    return i - n + 2;
            }
        return Integer.MAX_VALUE - 1;
    }
}
