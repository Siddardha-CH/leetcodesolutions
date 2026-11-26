Alice and Bob are playing a game where they take turns removing stones from a pile, with Alice going first.

Alice starts by removing exactly 10 stones on her first turn.
For each subsequent turn, each player removes exactly 1 fewer stone than the previous opponent.
The player who cannot make a move loses the game.

Given a positive integer n, return true if Alice wins the game and false otherwise.






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
        #  Date        : 2026-26-11                                               #
        #                                                                       #
        #########################################################################
        */
    public boolean canAliceWin(int n) {
        int b = 1;
        int k = 10;
        while (n >= k) {
            b *= -1;
            n -= k;
            k -= 1;
        }
        if (b == -1)
            return true;
        return false;
    }
}
