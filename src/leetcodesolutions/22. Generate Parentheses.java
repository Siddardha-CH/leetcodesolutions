Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.





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
        #  Date        : 2026-25-08                                             #
        #                                                                       #
        #########################################################################
        */
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        func (n * 2, n, n, new StringBuilder());
        return ans;
    }
    public void func (int n, int l, int r, StringBuilder sb) {
        if (n == sb.length()) {
            ans.add(sb.toString());
            return;
        }
        if (sb.length() > n || l < 0 || r < 0 || l > r )
            return;
        if (l > 0) {
            sb.append('(');
            func (n, l - 1, r, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (r > l) {
            sb.append(')');
            func(n, l, r - 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
