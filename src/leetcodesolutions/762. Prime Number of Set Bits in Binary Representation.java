Given two integers left and right, return the count of numbers in the inclusive range [left, right] having a prime number of set bits in their binary representation.

Recall that the number of set bits an integer has is the number of 1's present when written in binary.

For example, 21 written in binary is 10101, which has 3 set bits.






  ----------------------------------------------------------SOLUTION----------------------------------------------



class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) 
            if (val(Integer.bitCount(i)))
                ans += 1;
        return ans;
    }
    public boolean val(int k) {
        if ( k == 1)
            return false;
        if (k <= 3)
            return true;
        if (k % 2 == 0 || k % 3 == 0)
            return false;
        for (int i = 5; i * i <= k; i += 6) {
            if (k % i == 0 || k % (i + 2) == 0)
                return false;
        }
        return true;
    } 
}
