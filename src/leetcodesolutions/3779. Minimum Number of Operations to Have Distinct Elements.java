// You are given an integer array nums.

// In one operation, you remove the first three elements of the current array. If there are 
// fewer than three elements remaining, all remaining elements are removed.

// Repeat this operation until the array is empty or contains no duplicate values.

// Return an integer denoting the number of operations required.




__________________________________________SOLUTION______________________________________




  class Solution {
    public int minOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.contains(nums[i]))
                return i /3 + 1;
            else
                set.add(nums[i]);
        }
        return 0;
    }
}


class Solution {
    public int minOperations(int[] nums) {
        int k = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i,map.getOrDefault(i,0) + 1);
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > 1) {
                k = i;
            }
            map.put(nums[i],map.get(nums[i]) - 1);
            if (map.get(nums[i]) == 0)
                map.remove(nums[i]);
        }
        if (k == -1)
            return 0;
        int m = k + 1;
        if (m % 3 == 0)
            return m / 3;
        return m / 3 + 1;
    }
}
