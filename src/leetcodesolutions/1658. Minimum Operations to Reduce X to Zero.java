You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or the rightmost element from the array nums and subtract its value from x. Note that this modifies the array for future operations.

Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1







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
        #  Date        : 2026-23-08                                             #
        #                                                                       #
        #########################################################################
        */
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        int n = nums.length;
        for (int i : nums)
            sum += i;
        int target = sum - x;
        if (target == 0)
            return n;
        if (target < 0)
            return -1;
        // so now we have target so we need to find a sub array of sum target
        int l = 0;
        int r = 0;
        sum = 0;
        int ans = 100000;
        while (r < n) {
            sum += nums[r];
            while (sum > target && l <= r) {
                sum -= nums[l];
                l += 1;
            }
            if (sum == target)
                ans = Math.min(ans, n - (r - l + 1));
            r += 1;
        }
        if (ans == 100000)
            return -1;
        return ans;
    }
}
