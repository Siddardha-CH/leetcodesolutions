Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.






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
        #  Date        : 2026-03-09                                             #
        #                                                                       #
        #########################################################################
        */
    public int longestValidParentheses(String s) {
        int ans = 0;
        // int open = 0; 
        // int close = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);
        //     if (c == '(')
        //         open += 1;
        //     else {
        //         close += 1;
        //         if (close > open) {
        //             close = 0;
        //             open = 0;
        //         }
        //     }
        //     if (open == close)
        //         ans = Math.max(ans, open * 2);
        // }
        // open = 0;
        // close = 0;
        // for (int i = s.length() - 1; i >= 0; i--) {
        //     char c = s.charAt(i);
        //     if (c == '(') {
        //         open += 1;
        //         if (open > close) {
        //             open = 0;
        //             close = 0;
        //         }
        //     }
        //     else 
        //         close += 1;
        //     if (open == close)
        //         ans = Math.max(ans, open * 2);
        // }
        // return ans;

        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') 
                st.push(i);
            else {
                st.pop();
                if (st.isEmpty()) // -1 is poped [-1] and ')' this comes in
                    st.push(i);
                else
                    ans = Math.max(ans, i - st.peek());
            }
        }
        return ans;
    }
}
