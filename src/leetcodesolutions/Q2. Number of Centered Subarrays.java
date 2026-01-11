// You are given an integer array nums.

// A subarray of nums is called centered if the sum of its elements is equal to at least one element within that same subarray.

// Return the number of centered subarrays of nums.©leetcode



--------------------------SOLUTION-----------------------------




  class Solution {
    public int centeredSubarrays(int[] nums) {
        int ans = 0;
        for (int i = 0 ;i < nums.length; i++)
            {
                int s = 0;
                Set<Integer> k = new HashSet<>();
                for (int j = i; j < nums.length; j++)
                    {
                        s += nums[j];
                        k.add(nums[j]);
                        if (k.contains(s))
                            ans += 1;
                    }
            }
        return ans;
    }
}©leetcode
