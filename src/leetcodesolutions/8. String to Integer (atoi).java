Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.





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
        #  Date        : 2026-07-24                                             #
        #                                                                       #
        #########################################################################
        */
    public int myAtoi(String s) {
        long ans = 0;
        if (s == null || s.length() == 0)
            return 0;
        int i = 0;
        int n = s.length();
        while (i < n && s.charAt(i) == ' ' )
            i += 1;
        if (i == n)
            return 0;
        int k = 1;
        if (s.charAt(i) == '+')
            i += 1;
        else if (s.charAt(i) == '-') {
            k = -1;
            i += 1;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            int c = s.charAt(i) - '0';
            ans = ans * 10 + c;
            if (k * ans >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (k * ans <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i += 1;
        }
        return (int)ans * k;
    }
}
