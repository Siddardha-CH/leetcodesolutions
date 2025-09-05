// You are given two integers num1 and num2.

// In one operation, you can choose integer i in the range [0, 60] and subtract 2i + num2 from num1.

// Return the integer denoting the minimum number of operations needed to make num1 equal to 0.

// If it is impossible to make num1 equal to 0, return -1.


-----------------------------------------------------------------


  class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int i = 1; i < 37 ; i++) {
            long v = (long)num1 - (i * (long)num2);
            if (v < 0) {
                return -1;
            }
            if (Long.bitCount(v) <= i && i <= v) {
                return i;
            }
        }
        return -1;
    }
}
