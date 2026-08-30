You are given a 0-indexed array of distinct integers nums.

There is an element in nums that has the lowest value and an element that has the highest value. We call them the minimum and maximum respectively. Your goal is to remove both these elements from the array.

A deletion is defined as either removing an element from the front of the array or removing an element from the back of the array.

Return the minimum number of deletions it would take to remove both the minimum and maximum element from the array.




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
        #  Date        : 2026-08-30                                             #
        #                                                                       #
        #########################################################################
        */
    public int minimumDeletions(int[] nums) {
        int min = 10000000;
        int max = -1000000;
        int minidx = 0;
        int maxidx = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxidx = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minidx = i;
            }
        }
        int ans = Math.max(minidx, maxidx) + 1;
        ans = Math.min(ans, (Math.max(n - minidx, n - maxidx)));
        ans = Math.min(ans, minidx + 1 + n - maxidx);
        ans = Math.min(ans, maxidx + 1 + n - minidx);
        return ans;
    }
}
