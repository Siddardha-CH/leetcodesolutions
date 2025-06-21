Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.

_________________________________________________________________________________________________________________________________
---------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public int countDigits(int num) {
        int ans = 0;
        int n = num;
        while (num > 0) {
            int t = num % 10;
            if (n % t == 0) {
                ans += 1;
            }
            num /= 10;
        }
        return ans;
    }
}
