// You are given an integer array nums and an integer k. Your task is to partition nums into one or 
// more non-empty contiguous segments such that in each segment, the difference between its maximum and minimum elements is at most k.

// Return the total number of ways to partition nums under this condition.

// Since the answer may be too large, return it modulo 109 + 7.



______________________________________SOLUTION_______________________________________



  class Solution {
    public int countPartitions(int[] nums, int m) {
        int n = nums.length;
        long[] ps = new long[n + 1];
        long[] dp = new long[n + 1];
        dp[0] = 1;
        ps[0] = 1;
        TreeMap<Integer,Integer> k = new TreeMap<>();
        int j = 0;
        for (int i = 0; i < n; i++) {
            k.put(nums[i],k.getOrDefault(nums[i],0) + 1);
            while (j <= i && (k.lastKey() - k.firstKey()) > m) {
                int x = nums[j];
                int cnt = k.get(x);
                if (cnt == 1)
                    k.remove(x);
                else
                    k.put(x,cnt - 1);
                j += 1;
            }
            if (j == 0)
                dp[i + 1] = ps[i] % 1000000007;
            else 
                dp[i + 1] = (ps[i] - ps[j - 1] + 1000000007) % 1000000007;
            ps[i + 1] = (dp[i + 1] + ps[i]) % 1000000007;
        }
        return (int)dp[n];
     }
}
