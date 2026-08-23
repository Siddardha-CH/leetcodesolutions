Alice and Bob take turns playing a game, with Alice starting first.

You are given a string num of even length consisting of digits and '?' characters. On each turn, a player will do the following if there is still at least one '?' in num:

Choose an index i where num[i] == '?'.
Replace num[i] with any digit between '0' and '9'.
The game ends when there are no more '?' characters in num.

For Bob to win, the sum of the digits in the first half of num must be equal to the sum of the digits in the second half. For Alice to win, the sums must not be equal.

For example, if the game ended with num = "243801", then Bob wins because 2+4+3 = 8+0+1. If the game ended with num = "243803", then Alice wins because 2+4+3 != 8+0+3.
Assuming Alice and Bob play optimally, return true if Alice will win and false if Bob will win.





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
        #  Date        : 2026-08-23                                             #
        #                                                                       #
        #########################################################################
        */
    public boolean sumGame(String num) {
        int h1 = 0;
        int h2 = 0;
        int q1 = 0;
        int q2 = 0;
        int n = num.length();
        for (int i = 0; i < n / 2; i++) 
            if (num.charAt(i) == '?')
                q1 += 1;
            else
                h1 += (num.charAt(i) - '0');
        for (int i = n / 2; i < n; i++)
            if (num.charAt(i) == '?')
                q2 += 1;
            else
                h2 += (num.charAt(i) - '0');
        if ((q1 + q2) % 2 == 1) // as alice had upper hand 
            return true;
        if (h1 - h2 == (q2 - q1) / 2 * 9) // where the optimla goal is to bring 9 and make them equal
            return false;
        return true;
    }
}
