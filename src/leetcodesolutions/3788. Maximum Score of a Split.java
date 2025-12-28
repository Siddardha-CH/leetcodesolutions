// You are given an integer array nums of length n.

// Choose an index i such that 0 <= i < n - 1.

// For a chosen split index i:

// Let prefixSum(i) be the sum of nums[0] + nums[1] + ... + nums[i].
// Let suffixMin(i) be the minimum value among nums[i + 1], nums[i + 2], ..., nums[n - 1].
// The score of a split at index i is defined as:

// score(i) = prefixSum(i) - suffixMin(i)

// Return an integer denoting the maximum score over all valid split indices.



_________________________________________SOLUTION____________________________________




  class Solution {
    public long maximumScore(int[] nums) {
        int[] k = new int[nums.length];
        long pfs = 0;
        long ans = Integer.MIN_VALUE;
        int l = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            l = Math.min(l,nums[i]);
            k[i] = l;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            pfs += nums[i];
            ans = Math.max(ans,pfs - k[i + 1]);
        }
        return ans;
    }
}
