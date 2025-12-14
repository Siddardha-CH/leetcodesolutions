// Along a long library corridor, there is a line of seats and decorative plants. You are given a 0-indexed 
//   string corridor of length n consisting of letters 'S' and 'P' where each 'S' represents a seat and each 'P' represents a plant.

// One room divider has already been installed to the left of index 0, and another to the right of index n - 1. 
//   Additional room dividers can be installed. For each position between indices i - 1 and i (1 <= i <= n - 1), at most one divider can be installed.

// Divide the corridor into non-overlapping sections, where each section has exactly two seats with any number of plants. 
//   There may be multiple ways to perform the division. Two ways are different if there is a position with a room divider 
//   installed in the first way but not in the second way.

// Return the number of ways to divide the corridor. Since the answer may be very large, return it modulo 109 + 7. If there is no way, return 0.


_______________________________________SOLUTION_______________________________________





  class Solution {
    public int numberOfWays(String corridor) {
        long ans = 1;
        int c = 0;
        int p = 0;
        int ss = 0;
        for (char i : corridor.toCharArray()) {
            if (i == 'S' ) {
                ss += 1;
                if (c == 2) {
                    ans = (ans * (long)(p + 1)) % 1000000007;
                    c = 1;
                    p = 0;
                }
                else 
                    c += 1;
            }
            if (i == 'P' && c == 2)
                p += 1; 
        }
        if (ss % 2 == 1 || ss == 0)
            return 0;
        return (int)ans;
    }
}
