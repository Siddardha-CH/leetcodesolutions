The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer n, return its complement.




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
  
