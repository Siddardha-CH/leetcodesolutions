Given a balanced parentheses string s, return the score of the string.

The score of a balanced parentheses string is based on the following rule:

"()" has score 1.
AB has score A + B, where A and B are balanced parentheses strings.
(A) has score 2 * A, where A is a balanced parentheses string.






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
        #  Date        : 2026-05-09                                             #
        #                                                                       #
        #########################################################################
        */
    public int scoreOfParentheses(String s) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '(') {
                stack.push(ans);
                ans = 0;
            }
            else {
                if (s.charAt(i - 1) == '(')
                    ans = stack.peek() + 1; //base case where a valid 1st () so score 1
                else 
                    ans = stack.peek() + 2 * ans; 
                stack.pop();
            }
        return ans;
    }
}
