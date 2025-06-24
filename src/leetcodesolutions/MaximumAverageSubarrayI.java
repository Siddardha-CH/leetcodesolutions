// You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value 
// and return this value. Any answer with a calculation error less than 10-5 will be accepted.

_________________________________________________________________________________________________________________________________________
  ----------------------------------------------------------------------------------------------------------------------------------------
SOL - I

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = -999999;
        int a = 0;
        int b = k - 1;
        while (b < nums.length) {
            double t = 0;
            for (int i = a; i <= b; i++) {
                t += nums[i];
            }
            ans = Math.max(ans, t);
            
            a++;
            b++;
        }
        return ans / k;




  SOL - II

  class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int t = 0;
        for (int i = 0; i < k; i++) {
            t += nums[i];
        }
        int a = 0;
        int b = k;
        double ans = t;
        while (b < nums.length) {
            t = t - nums[a] + nums[b];
            ans = Math.max(ans, t);
            a++;
            b++;
        }
        return ans/k;
    }
}

    
