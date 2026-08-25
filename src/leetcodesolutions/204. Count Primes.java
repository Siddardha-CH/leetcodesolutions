Given an integer n, return the number of prime numbers that are strictly less than n.





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
        #  Date        : 2026-08-25                                             #
        #                                                                       #
        #########################################################################
        */
    public int countPrimes(int n) {
        boolean[] b = new boolean[n];
        int ans = 0;
        for (int i = 2; i * i < n; i++) 
            if (!b[i]) 
                for (int j = i * i; j < n; j += i)
                    b[j] = true;
        for (int i = 2; i < n; i++)
            if (!b[i])
                ans += 1;
        return ans;
    }
}
