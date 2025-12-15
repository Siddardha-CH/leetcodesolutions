// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.


____________________________SOLUTION_____________________________



  class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> k = new HashSet<>();
        for (int i : nums)
            k.add(i);
        int ans = 0;
        int l  =0;
        for (int i : k) {
            if (!k.contains(i - 1))  {
                l = 1;
                while (k.contains(i + l))
                    l += 1;
                ans = Math.max(ans,l);
            }
        }
        return ans;
    }
}
