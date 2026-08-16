Alice and Bob continue their games with stones. There is a row of n stones, and each stone has an associated value. You are given an integer array stones, where stones[i] is the value of the ith stone.

Alice and Bob take turns, with Alice starting first. On each turn, the player may remove any stone from stones. The player who removes a stone loses if the sum of the values of all removed stones is divisible by 3. Bob will win automatically if there are no remaining stones (even if it is Alice's turn).

Assuming both players play optimally, return true if Alice wins and false if Bob wins.





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
        #  Date        : 2026-08-16                                             #
        #                                                                       #
        #########################################################################
        */
    public boolean stoneGameIX(int[] stones) {
        int zero = 0;
        int ones = 0;
        int twos = 0;
        for (int i : stones)
            if (i % 3 == 0)
                zero += 1;
            else if (i % 3 == 1)
                ones += 1;
            else
                twos += 1;

        if (ones == 0 && twos == 0) // only contains % 3(0`s) numbers so alice picks and looses
            return false;
        
        //even zeros
        if (zero % 2 == 0) {
            if (ones > 0 && twos > 0) // always alice wins coz 1122 1->1->2->2=6 || 112 2->1=3
                return true;
            return false;
        }
        if (Math.abs(ones - twos) > 2) // alice wins coz odd zero : 111120 1->1->0->2->1->1=6 || 22220 2->2->0->2=6
            return true;
        return false;
    }
}
