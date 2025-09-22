// Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

// The following rules define a valid string:

// Any left parenthesis '(' must have a corresponding right parenthesis ')'.
// Any right parenthesis ')' must have a corresponding left parenthesis '('.
// Left parenthesis '(' must go before the corresponding right parenthesis ')'.
// '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".


-------------------------------------------------------------------------


  class Solution {
    public boolean checkValidString(String s) {
        int c1 = 0 ;
        int c2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            if (k == '(') {
                c1 += 1;
                c2 += 1;
            }
            else if (k == ')') {
                c1 -= 1;
                c2 = Math.max(0,c2 - 1);
            }
            else {
                c1 += 1;
                c2 = Math.max(0, c2 - 1);
            }
            if (c1 < 0) {
                return false;
            }
        }
        if (c2 == 0) {
            return true;
        }
        return false;
    }
}
