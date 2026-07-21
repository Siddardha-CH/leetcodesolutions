Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.





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
        #  Date        : 2026-07-21                                             #
        #                                                                       #
        #########################################################################
        */
    public boolean judgeSquareSum(int c) {
        int l = 0;
        int r = (int) Math.sqrt(c);
        while (r >= l) {
            long  k = (long)(l * l) + (long)(r * r);
            if (c ==  k)
                return true;
            else if (k  > c)
                r -= 1;
            else
                l += 1;
        }
        return false;
    }
}
