You are given a binary string s. You are allowed to perform two types of operations on the string in any sequence:

Type-1: Remove the character at the start of the string s and append it to the end of the string.
Type-2: Pick any character in s and flip its value, i.e., if its value is '0' it becomes '1' and vice-versa.
Return the minimum number of type-2 operations you need to perform such that s becomes alternating.

The string is called alternating if no two adjacent characters are equal.

For example, the strings "010" and "1010" are alternating, while the string "0100" is not.




        /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-03-11                                               #
        #                                                                       #
        #########################################################################
        */


  class Solution {
    public int bitwiseComplement(int n) {
        long ans = 0;
        String k = Integer.toBinaryString(n);
        for (int i = 0; i < k.length(); i++) 
            if (k.charAt(i) == '1') 
                ans *= 2;
            else {
                ans *= 2;
                ans += 1;
            }
        return (int) ans;
    
    }
}
  
