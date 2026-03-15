You are given an integer n.

Return the total number of commas used when writing all integers from [1, n] (inclusive) in standard number formatting.

In standard formatting:

A comma is inserted after every three digits from the right.
Numbers with fewer than 4 digits contain no commas.





  class Solution {
    public long countCommas(long n) {
 /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-03-15                                              #
        #                                                                       #
        #########################################################################
        */
        if (n <= 999)
            return 0;
        if (n <= 999999)
            return n - 999;
        if (n <= 999999999)
            return 999000l + ((n - 999999) * 2);
        if (n <= 999999999999l)
            return 999000l + (999000000l * 2) + (n - 999999999) * 3;
        if (n == 1000000000000000l)
            return 1 + 999000l + (999000000l * 2) + (999000000000l * 3) + ((n - 999999999999l) * 4);
        return 999000l + (999000000l * 2) + (999000000000l * 3) + ((n - 999999999999l) * 4);
            
    }
}
