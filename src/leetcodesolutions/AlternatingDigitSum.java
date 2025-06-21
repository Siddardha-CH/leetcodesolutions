// You are given a positive integer n. Each digit of n has a sign according to the following rules:

// The most significant digit is assigned a positive sign.
// Each other digit has an opposite sign to its adjacent digits.
// Return the sum of all digits with their corresponding sign.

_______________________________________________________________________________________________________________________________
  ------------------------------------------------------------------------------------------------------------------------------


class Solution {
    public int alternateDigitSum(int n) {
        int ans = 0;
        String s = Integer.toString(n);
        if (s.length() % 2 == 1){
            int c = 1;
            while (n > 0) {
                int t = n % 10;
                if (c % 2 == 1) {
                    c++;
                    ans += t;
                }
                else {
                    c++;
                    ans -= t;
                }
                n /= 10;
            }
        }
        else {
            int c = 1;
            while (n > 0) {
                int t = n % 10;
                if (c % 2 != 1) {
                    c++;
                    ans += t;
                }
                else {
                    c++;
                    ans -= t;
                }
                n /= 10;
            }
        }
        return ans;
    }
}
