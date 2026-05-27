You are given a string password.

The strength of the password is calculated based on the following rules:

1 point for each distinct lowercase letter ('a' to 'z').
2 points for each distinct uppercase letter ('A' to 'Z').
3 points for each distinct digit ('0' to '9').
5 points for each distinct special character from the set "!@#$".
Each character contributes at most once, even if it appears multiple times.

Return an integer denoting the strength of the password.



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
        #  Date        : 2026-05-27                                             #
        #                                                                       #
        #########################################################################
        */
    public int passwordStrength(String password) {
        Set<Character> set = new HashSet<>();
        int ans = 0;
        for (char c : password.toCharArray()) 
            set.add(c);
        
        for (char c : set) {
            if (c >= 'A' && c <= 'Z')
                ans += 2;
            else if (c >= 'a' && c <= 'z')
                ans += 1;
            else if (c >= '0' && c <= '9')
                ans += 3;
            else
                ans += 5;
        }
        return ans;
    }
}
