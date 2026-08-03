Alice and Bob continue their games with piles of stones. There are several stones arranged in a row, and each stone has an associated value which is an integer given in the array stoneValue.

Alice and Bob take turns, with Alice starting first. On each player's turn, that player can take 1, 2, or 3 stones from the first remaining stones in the row.

The score of each player is the sum of the values of the stones taken. The score of each player is 0 initially.

The objective of the game is to end with the highest score, and the winner is the player with the highest score and there could be a tie. The game continues until all the stones have been taken.

Assume Alice and Bob play optimally.

Return "Alice" if Alice will win, "Bob" if Bob will win, or "Tie" if they will end the game with the same score.






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
        #  Date        : 2026-08-03                                             #
        #                                                                       #
        #########################################################################
        */
    int alice = 0;
    int bob = 1;
    public String stoneGameIII(int[] nums) {
        int[][] dp = new int[2][nums.length + 1];
        for (int[] i : dp)
            Arrays.fill(i, -1);
        int diff = func(alice, 0, nums, dp);
        if (diff > 0)   
            return "Alice";
        else if (diff < 0)
            return "Bob";
        return "Tie";
    }
    public int func(int player, int i, int[] nums, int[][] dp) {
        if (i >= nums.length)
            return 0;
        if (dp[player][i] != -1)
            return dp[player][i];
        int res;
        if (player == alice)
            res = Integer.MIN_VALUE;
        else
            res = Integer.MAX_VALUE;
        int sum = 0;
        for (int j = i; j < Math.min(i + 3, nums.length); j++) {
            if (player == alice) {
                sum += nums[j];
                res = Math.max(res, sum + func(bob, j + 1, nums, dp));
            }
            else {
                sum -= nums[j];
                res = Math.min(res, sum + func(alice, j + 1, nums, dp));
            }
        }
        dp[player][i] = res;
        return res;
    }
}
