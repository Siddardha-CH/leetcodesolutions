// No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.

// Given an integer n, return a list of two integers [a, b] where:

// a and b are No-Zero integers.
// a + b = n
// The test cases are generated so that there is at least one valid solution. If there are many valid
// solutions, you can return any of them.


---------------------------------------------------------------



  class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int a = i;
            int b = n - i;
            boolean k = true;
            boolean m = true;
            while (a > 0) {
                if (a % 10 == 0) {
                    k = false;
                    break;
                }
                a /= 10;
            }
            while (b > 0) {
                if (b % 10 == 0) {
                    m = false;
                    break;
                }
                b /= 10;
            }
            if (m == true && k == true) {
                return new int[] {i,n-i};
            }
        }
        return new int[] {};
    }
}
