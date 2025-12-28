// You are given a positive integer k.

// Find the smallest integer n divisible by k that consists of only the digit 1 in its decimal representation (e.g., 1, 11, 111, ...).

// Return an integer denoting the number of digits in the decimal representation of n. If no such n exists, return -1



________________________________________SOLUTION_____________________________________




  class Solution {
    public int minAllOneMultiple(int k) {
        if (k % 2 == 0)
            return -1;
        if (k % 5 == 0)
            return -1;
        long l = 1;
        for (int i = 1; i<= k; i++) {
            if (l == 0)
                return i;
            l = (l * 10) + 1;
            l %= k;
        }
        return -1;
    }
}   
