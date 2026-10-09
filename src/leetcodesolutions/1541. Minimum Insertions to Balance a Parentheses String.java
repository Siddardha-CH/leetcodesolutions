Given a parentheses string s containing only the characters '(' and ')'. A parentheses string is balanced if:

Any left parenthesis '(' must have a corresponding two consecutive right parenthesis '))'.
Left parenthesis '(' must go before the corresponding two consecutive right parenthesis '))'.
In other words, we treat '(' as an opening parenthesis and '))' as a closing parenthesis.

For example, "())", "())(())))" and "(())())))" are balanced, ")()", "()))" and "(()))" are not balanced.
You can insert the characters '(' and ')' at any position of the string to balance it if needed.

Return the minimum number of insertions needed to make s balanced.






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
        #  Date        : 2026-09-10                                             #
        #                                                                       #
        #########################################################################
        */
    public int minInsertions(String s) {
        int ans = 0;
        int open = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                open += 1;
            else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')')
                    i += 1; // if 2 there ))
                else
                    ans += 1; // if only 1 there )
                if (open > 0)
                    open -= 1;
                else
                    ans += 1; // n openings (
            }
        }
        ans += (open * 2);
        return ans;
    }
}
