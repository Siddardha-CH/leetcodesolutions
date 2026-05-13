You are given an integer array nums of even length n and an integer limit. In one move, you can replace any integer from nums with another integer between 1 and limit, inclusive.

The array nums is complementary if for all indices i (0-indexed), nums[i] + nums[n - 1 - i] equals the same number. For example, the array [1,2,3,4] is complementary because for all indices i, nums[i] + nums[n - 1 - i] = 5.

Return the minimum number of moves required to make nums complementary.





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
        #  Date        : 2026-05-13                                             #
        #                                                                       #
        #########################################################################
        */
    public int minMoves(int[] nums, int limit) {
        int n = nums.length;
        int[] diff = new int[2 * limit + 2];

        for (int i = 0; i < n / 2; i++) {
            int a = nums[i];
            int b = nums[n - i - 1];

            int min = Math.min(a, b);
            int max = Math.max(a, b);
            diff[2] += 2;
            
            diff[min + 1] -= 1;
            diff[max +limit + 1] += 1;
            diff[min + max] -= 1;
            diff[min + max + 1] += 1;
        }
        // used diff array 

        int ans = Integer.MAX_VALUE;
        int t = 0;

        for (int i = 2; i < diff.length; i++) {
            t += diff[i];
            ans = Math.min(ans, t);
        }

        return ans;
    }
}
