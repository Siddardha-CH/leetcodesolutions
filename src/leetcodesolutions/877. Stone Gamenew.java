Alice and Bob play a game with piles of stones. There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].

The objective of the game is to end with the most stones. The total number of stones across all the piles is odd, so there are no ties.

Alice and Bob take turns, with Alice starting first. Each turn, a player takes the entire pile of stones either from the beginning or from the end of the row. This continues until there are no more piles left, at which point the person with the most stones wins.

Assuming Alice and Bob play optimally, return true if Alice wins the game, or false if Bob wins.




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
        #  Date        : 2026-08-02                                             #
        #                                                                       #
        #########################################################################
        */
    int[][] dp = new int[501][501];
    public boolean stoneGame(int[] piles) {
        // return true;  is the og solution as the length is always even alice picks the ebst and optimmla
        //if we have to solve 
        for (int[] i : dp)
            Arrays.fill(i, -1);
        int tot = 0;
        for (int i : piles)
            tot += i;
        int p1_score = func(0, piles.length - 1, piles);
        if (p1_score > tot / 2)
            return true;
        return false;
    }
    public int func(int l, int r, int[] nums) {
        if (l > r)
            return 0;
        if (dp[l][r] != -1)
            return dp[l][r];
        int pick_l = nums[l]  + Math.min(func(l + 2, r, nums), func(l + 1, r - 1, nums));
        // here pickl is the present num + the next after BOBs turn if bob choose l + 1 or he choose r we have i + 2 to j or i + 1 to j - 1
        int pick_r = nums[r]  + Math.min(func(l + 1, r - 1, nums), func(l, r - 2, nums));
        // here pickr is the present num + the next after BOBs turn if bob choose r - 1 or he choose l have l to r - 2 or l + 1 to r - 1
        // we chose min coz BOB gets max 
        int max = Math.max(pick_l, pick_r);
        dp[l][r] = max;
        return max;
    }
}
