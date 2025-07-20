// You have n coins and you want to build a staircase with these coins. The staircase consists 
// of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

// Given the integer n, return the number of complete rows of the staircase you will build.


_______________________________________________________________________________________________________________


  class Solution {
    public int arrangeCoins(int n) {
        int k = n;
        if (n == 1) {
            return 1;
        }
        for (int i = 0; i <= k; i++) {
            n = n - i;
            if (n < 0) {
                return i - 1;
            }
        }
        return 0;
    }
}
