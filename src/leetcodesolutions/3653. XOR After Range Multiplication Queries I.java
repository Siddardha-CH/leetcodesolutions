You are given an integer array nums of length n and a 2D integer array queries of size q, where queries[i] = [li, ri, ki, vi].

For each query, you must apply the following operations in order:

Set idx = li.
While idx <= ri:
Update: nums[idx] = (nums[idx] * vi) % (109 + 7)
Set idx += ki.
Return the bitwise XOR of all elements in nums after processing all queries.



class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-09                                             #
        #                                                                       #
        #########################################################################
        */
        for (int[] arr : queries) {
            int idx = arr[0];
            while (idx <= arr[1]) {
                nums[idx] = (int)(((long)nums[idx] * arr[3]) % (1000000007));
                idx += arr[2];
            }
        }
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++)
            ans ^= nums[i];
        return ans;
    }
}
