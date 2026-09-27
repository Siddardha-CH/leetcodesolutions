You are given a string s that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should not contain any brackets.





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
        #  Date        : 2026-27-08                                             #
        #                                                                       #
        #########################################################################
        */
    public String reverseParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (char c : s.toCharArray()) 
            if (c == '(')
                stack.push(ans.length());
            else if (c ==')') {
                int st = stack.pop();
                int end = ans.length() - 1;
                while (end > st) {
                    char temp = ans.charAt(st);
                    ans.setCharAt(st, ans.charAt(end));
                    ans.setCharAt(end, temp);
                    st += 1;
                    end -= 1;
                }
            }
            else
                ans.append(c);
        
        return ans.toString();
    }

}
