You are given an integer array nums. Two players are playing a game with this array: player 1 and player 2.

Player 1 and player 2 take turns, with player 1 starting first. Both players start the game with a score of 0. At each turn, the player takes one of the numbers from either end of the array (i.e., nums[0] or nums[nums.length - 1]) which reduces the size of the array by 1. The player adds the chosen number to their score. The game ends when there are no more elements in the array.

Return true if Player 1 can win the game. If the scores of both players are equal, then player 1 is still the winner, and you should also return true. You may assume that both players are playing optimally.






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
        #  Date        : 2026-08-01                                             #
        #                                                                       #
        #########################################################################
        */
    int[][] dp = new int[23][23];
    public boolean predictTheWinner(int[] nums) {
        for (int[] i : dp)
            Arrays.fill(i, -1);
            int ans = solve(0, nums.length - 1, nums);
        if (ans > - 1)
            return true;
        return false;
    }
    public int solve(int l, int r, int[] nums) {
        if (l == r)
            return nums[r];
        if (dp[l][r] != -1)
            return dp[l][r];
        int pickst = nums[l] - solve(l + 1, r, nums);
        int pickend = nums[r] - solve(l, r - 1, nums);

        int max = Math.max(pickst, pickend);
        dp[l][r] =max;
        return max;
    }
}
