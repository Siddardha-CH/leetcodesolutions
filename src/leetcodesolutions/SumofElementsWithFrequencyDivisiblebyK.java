// You are given an integer array nums and an integer k.

// Return an integer denoting the sum of all elements in nums whose frequency is divisible by k, or 0 if there are no such elements.

// Note: An element is included in the sum exactly as many times as it appears in the array if its total frequency is divisible by k.

// The frequency of an element x is the number of times it occurs in the array.©leetcode


--------------------------------------------------------------------


  class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int ans = 0;
        int[] p = new  int[100];
        for (int i : nums) {
            p[i - 1] += 1;
        }
        for (int  i =0 ; i < 100; i++) {
            if (p[i] % k == 0) {
                ans += p[i] * (i + 1);
            }
        }
        return ans;
    }
}©leetcode
