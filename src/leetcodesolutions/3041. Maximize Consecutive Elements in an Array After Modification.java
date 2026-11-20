You are given a 0-indexed array nums consisting of positive integers.

Initially, you can increase the value of any element in the array by at most 1.

After that, you need to select one or more elements from the final array such that those elements are consecutive when sorted in increasing order. For example, the elements [3, 4, 5] are consecutive while [3, 4, 6] and [1, 1, 2, 3] are not.

Return the maximum number of elements that you can select.





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
        #  Date        : 2026-20-11                                               #
        #                                                                       #
        #########################################################################
        */
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int ans = 1;
        int[] dp = new int[nums[nums.length - 1] + 3];
        for (int i : nums) {
            dp[i + 1] = Math.max(dp[i + 1], dp[i] + 1);
            dp[i] = Math.max(dp[i], dp[i - 1] + 1);
            ans = Math.max(ans, Math.max(dp[i], dp[i + 1]));
        }
        return ans;
    }
}
