Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

A subarray is a contiguous part of the array.



--------------------------------------SOLUTION-----------------------------------------




class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // Map<Integer,Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     int s = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         s += nums[j];
        //         if (s > goal)
        //             break;
        //         map.put(s,map.getOrDefault(s,0) + 1);
        //         System.out.println(s);
        //     }
        // }
        // if (map.containsKey(goal))
        //     return map.get(goal);
        // return 0;
        return atmost(nums, goal) - atmost(nums, goal - 1);
    }
    public int atmost(int[] nums, int g) {
        int s = 0;
        int l = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            while (s > g && i >= l) {
                s -= nums[l];
                l += 1;
            }
            ans += (i - l + 1);
        }
        return ans;
    }
}
