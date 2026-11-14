You are given an integer array nums and two integers l and r. Your task is to find the minimum sum of a subarray whose size is between l and r (inclusive) and whose sum is greater than 0.

Return the minimum sum of such a subarray. If no such subarray exists, return -1.

A subarray is a contiguous non-empty sequence of elements within an array.







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
        #  Date        : 2026-14-11                                               #
        #                                                                       #
        #########################################################################
        */
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] prefix = new int[n];
        int ans = Integer.MAX_VALUE;
        prefix[0] = nums.get(0);
        for (int i = 1; i < n; i++)
            prefix[i] = prefix[i - 1] + nums.get(i);
        for (int i = l; i < r + 1; i++) {
            int left = -1;
            for (int j = i - 1; j < n; j++) {
                if (left == -1) {
                    if (prefix[j] > 0)
                        ans = Math.min(ans, prefix[j]);
                }
                else {
                    if (prefix[j] - prefix[left] > 0)
                        ans = Math.min(ans, prefix[j] - prefix[left]);
                }
                left += 1;
            }
        }
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
