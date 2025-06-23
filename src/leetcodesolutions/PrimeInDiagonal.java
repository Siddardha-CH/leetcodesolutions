// You are given a 0-indexed two-dimensional integer array nums.

// Return the largest prime number that lies on at least one of the diagonals of nums. In case, no prime is 
//   present on any of the diagonals, return 0.

// Note that:

// An integer is prime if it is greater than 1 and has no positive integer divisors other than 1 and itself.
// An integer val is on one of the diagonals of nums if there exists an integer i for which nums[i][i] = val 
// or an i for which nums[i][nums.length - i - 1] = val.

________________________________________________________________________________________________________________________________________
  --------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public int diagonalPrime(int[][] nums) {
        int ans = 0;
        int l = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            int t1 = nums[i][i];
            int c1 = 0;
            for (int k = 2; k * k <= t1; k++) {
                if (t1 % k == 0) {
                    c1++;
                    break;
                } 
            }
            if (c1 == 0 && t1 > 1) {
                ans = Math.max(ans ,t1);
            }
            int t2 = nums[i][l];
            int c2 = 0;
            for (int k = 2; k * k <= t2; k++) {
                if (t2 % k == 0) {
                    c2++;
                    break;
                } 
            }
            l--;
            if (c2 == 0 && t2 > 1) {
                ans = Math.max(ans, t2);

            }
        }
        return ans;
    }
}
