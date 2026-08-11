You are given a 0-indexed array of integers nums.

A prefix nums[0..i] is sequential if, for all 1 <= j <= i, nums[j] = nums[j - 1] + 1. In particular, the prefix consisting only of nums[0] is sequential.

Return the smallest integer x missing from nums such that x is greater than or equal to the sum of the longest sequential prefix.





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
        #  Date        : 2026-08-11                                             #
        #                                                                       #
        #########################################################################
        */
    public int missingInteger(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) 
            set.add(i);
        int ans = nums[0];
        int i = 1;
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            ans += nums[i];
            i += 1;
        }
        while (set.contains(ans))
            ans += 1;
        return ans;
    }
}
