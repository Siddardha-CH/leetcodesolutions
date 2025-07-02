// Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.

// An integer m is a divisor of n if there exists an integer k such that n = k * m.

____________________________________________________________________________________________________
   ---------------------------------------------------------------------------------------------


  class Solution {
    public boolean isThree(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ans += 1;
            }
        }
        if (ans == 3) {
            return true;
        }
        return false; 
    }
}
