Reverse bits of a given 32 bits signed integer.






-------------------------------SOLUTION-------------------------------




  class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int m = n % 2;
            n /= 2;
            ans *= 2;
            ans += m;
        }
        return ans;
    }
}
