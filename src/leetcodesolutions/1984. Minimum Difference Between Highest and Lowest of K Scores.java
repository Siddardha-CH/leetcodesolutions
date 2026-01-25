// You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

// Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

// Return the minimum possible difference.

 -----------------------------SOLUTION--------------------------



   class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 0)
            return 0;
        Arrays.sort(nums);
        int i = 0;
        int ans = Integer.MAX_VALUE;
        while (i + k <= nums.length ) 
            ans = Math.min(ans,nums[i + k -1] - nums[i++]);
        return ans;
    }
}
