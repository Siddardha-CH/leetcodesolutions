You are given two positive integers num and sum.

A positive integer n is good if it satisfies both of the following:

The number of digits in n is exactly num.
The sum of digits in n is exactly sum.
The score of a good integer n is the sum of the squares of digits in n.

Return a string denoting the good integer n that achieves the maximum score. If there are multiple possible integers, return the maximum ​​​​​​​one. If no such integer exists, return an empty string.






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
        #  Date        : 2026-14-10                                             #
        #                                                                       #
        #########################################################################
        */
    public String maxSumOfSquares(int num, int sum) {
        ArrayList<Character> k = new ArrayList<>();
        if (9 * num < sum) {
            return "";
        }
        for (int  i =0 ; i  < num; i++) {
            int n = Math.min(9,sum);
            k.add((char)('0' + n));
            sum -= n;
        }
        
        StringBuilder ans = new StringBuilder();
        for (Character i : k) {
            ans.append(i);
        }
        return ans.toString();
    }
}
