You are given a string s consisting of lowercase English letters and the special characters: '*', '#', and '%'.

You are also given an integer k.

Build a new string result by processing s according to the following rules from left to right:

If the letter is a lowercase English letter append it to result.
A '*' removes the last character from result, if it exists.
A '#' duplicates the current result and appends it to itself.
A '%' reverses the current result.
Return the kth character of the final string result. If k is out of the bounds of result, return '.'.






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
        #  Date        : 2026-06-17                                             #
        #                                                                       #
        #########################################################################
        */
    public char processStr(String s, long k) {
        StringBuilder sb = new StringBuilder();
        boolean rev = true;
        long l = 0;
        for (char c : s.toCharArray()) {
            if (c == '*')  {
                if (l > 0)
                    l -= 1;
            }
            else if (c == '#')
                l *= 2;
            else if (c == '%')
                continue;
            else
                l += 1;
        }
        if (k >= l)
            return '.';
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '*')
                l += 1;
            else if (c == '#') {
                l /= 2;
                if (k >= l)
                    k -= l;
            }
            else if (c == '%')
                k = l - k - 1;              // this is formula where we get the reversed index
            else
                l -= 1;

            if (k == l)
                return c;
        }
        return '.';
    }
}
