You are given a string s consisting of lowercase English letters.

In one operation, you can select any substring of s that is not the entire string and sort it in non-descending alphabetical order.

Return the minimum number of operations required to make s sorted in non-descending order. If it is not possible, return -1.




class Solution {
    public int minOperations(String s) {    
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-03-10                                               #
        #                                                                       #
        #########################################################################
        */


        if (s.length() == 1)
            return 0;
        if (s.length() == 2 && s.charAt(0) > s.charAt(1))
            return -1;
        if (s.length() == 2)
            return 0;
        boolean b = true;
        for (int i = 0; i < s.length() - 1; i++)
            if (s.charAt(i) > s.charAt(i + 1))
                b = false;
        if (b)
            return 0;
        char min = s.charAt(1);
        char max = s.charAt(1);
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) > max)
                max = s.charAt(i);
            if (s.charAt(i) < min)
                min = s.charAt(i);
        }
        if (s.charAt(0) <= s.charAt(s.length() - 1) && (s.charAt(0) <= min || s.charAt(s.length() - 1) >= max))
            return 1;
        else if (s.charAt(0) > max && s.charAt(s.length() - 1) < min)
            return 3;
        else
            return 2;
    }
}

  
