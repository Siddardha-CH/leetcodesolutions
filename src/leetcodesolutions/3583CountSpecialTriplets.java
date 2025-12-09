// You are given an integer array nums.

// A special triplet is defined as a triplet of indices (i, j, k) such that:

// 0 <= i < j < k < n, where n = nums.length
// nums[i] == nums[j] * 2
// nums[k] == nums[j] * 2
// Return the total number of special triplets in the array.

// Since the answer may be large, return it modulo 109 + 7.


___________________________SOLUTION_____________________________



  class Solution {
    public int specialTriplets(int[] nums) {
        long ans = 0;
        Map<Integer,Integer> m1 = new HashMap<>();
        Map<Integer,Integer> m2 = new HashMap<>();
        for (int i : nums)
            m2.put(i,m2.getOrDefault(i,0) + 1);
        m1.put(nums[0],1);
        m2.put(nums[0],m2.get(nums[0]) - 1);
        if (m2.get(nums[0]) == 0)
            m2.remove(nums[0]);
        for (int i = 1; i < nums.length - 1; i++) {
            m2.put(nums[i],m2.get(nums[i]) - 1);
            if (m2.get(nums[i]) == 0)
                m2.remove(nums[i]);
            if (m1.containsKey(nums[i] * 2) && m2.containsKey(nums[i] * 2)) {
                ans = (ans +(long) m1.get(nums[i] * 2) * m2.get(nums[i] * 2)) % 1000000007;
            }
            m1.put(nums[i],m1.getOrDefault(nums[i],0) + 1);
        }
        return (int)ans;
    }
}
