You are given an integer array nums and an integer k.

The frequency of an element x is the number of times it occurs in an array.

An array is called good if the frequency of each element in this array is less than or equal to k.

Return the length of the longest good subarray of nums.

A subarray is a contiguous non-empty sequence of elements within an array.






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
        #  Date        : 2026-08-12                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int ans = 1;
        for (int r = 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            if (map.get(nums[r]) > k) {
                while (map.get(nums[r]) != k) {
                    map.put(nums[l], map.get(nums[l]) - 1);
                    l += 1;
                }
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
