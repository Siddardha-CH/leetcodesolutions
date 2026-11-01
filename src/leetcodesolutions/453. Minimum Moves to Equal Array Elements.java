Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

In one move, you can increment n - 1 elements of the array by 1.






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
        #  Date        : 2026-01-11                                               #
        #                                                                       #
        #########################################################################
        */
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;;
        for (int i : nums)
            min = Math.min  (min, i);
        int ans = 0;
        for (int i : nums)
            ans += (i - min);
        return ans;
    }
}
