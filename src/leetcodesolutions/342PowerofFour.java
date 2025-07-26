// Given an integer n, return true if it is a power of four. Otherwise, return false.

// An integer n is a power of four, if there exists an integer x such that n == 4x.

_____________________________________________________________________________________



  class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 4 != 0){
            return false;
        }
        while(n > 0) {
            if (n == 1) {
                return true;
            }
            if (n % 4 != 0) {
                return false;
            }
            n = n / 4;
        }
        return false;
    }
}
