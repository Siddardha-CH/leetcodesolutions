An integer x is a good if after rotating each digit individually by 180 degrees, we get a valid number that is different from x. Each digit must be rotated - we cannot choose to leave it alone.

A number is valid if each digit remains a digit after rotation. For example:

0, 1, and 8 rotate to themselves,
2 and 5 rotate to each other (in this case they are rotated in a different direction, in other words, 2 or 5 gets mirrored),
6 and 9 rotate to each other, and
the rest of the numbers do not rotate to any other number and become invalid.
Given an integer n, return the number of good integers in the range [1, n].





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
        #  Date        : 2026-05-02                                             #
        #                                                                       #
        #########################################################################
        */
    public int rotatedDigits(int n) {

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            boolean b = false; 
            boolean c = true;
            int m = i;

            while (m > 0) {
                int t = m % 10;
                m /= 10;

                if (t == 2 || t == 5 || t == 6 || t == 9)
                    b = true;
                if (t == 3 || t == 4 || t == 7)
                    c = false;

                if (!c)
                    break;
            }
            if (b && c)
                ans += 1;
        }
        return ans;
    }
}
