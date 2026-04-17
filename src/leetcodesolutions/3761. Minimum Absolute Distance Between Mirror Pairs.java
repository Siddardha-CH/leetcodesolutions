You are given an integer array nums.

A mirror pair is a pair of indices (i, j) such that:

0 <= i < j < nums.length, and
reverse(nums[i]) == nums[j], where reverse(x) denotes the integer formed by reversing the digits of x. Leading zeros are omitted after reversing, for example reverse(120) = 21.
Return the minimum absolute distance between the indices of any mirror pair. The absolute distance between indices i and j is abs(i - j).

If no mirror pair exists, return -1.




class Solution {
    public int minMirrorPairDistance(int[] nums) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-17                                             #
        #                                                                       #
        #########################################################################
        */

        int ans = 999999;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (map.containsKey(n))
                ans = Math.min(ans, i - map.get(n));
            int nn = 0;
            while (n > 0) {
                int t = n % 10;
                n /= 10;
                nn *= 10;
                nn += t;
            } 
            map.put(nn, i);
        }
        if (ans == 999999)
            return -1;
        return ans;
    }
}
