// Given an array nums of n integers, your task is to find the maximum value of k for which
// there exist two adjacent subarrays of length k each, such that both subarrays are strictly increasing. 
// Specifically, check if there are two subarrays of length k starting at indices a and b (a < b), where:

// Both subarrays nums[a..a + k - 1] and nums[b..b + k - 1] are strictly increasing.
// The subarrays must be adjacent, meaning b = a + k.
// Return the maximum possible value of k.

// A subarray is a contiguous non-empty sequence of elements within an array.

-------------------------------------------SOLUTION-------------------------------------------------------



  class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int ans = -999999999;
        int c = 1;
        int  m =-999999999;
        List<Integer> k = new ArrayList<>();
        for (int  i =0 ; i < nums.size() - 1; i++) {
            if (nums.get(i + 1) > nums.get(i)) {
                c += 1;
            }
            else {
                k.add(c);
                c = 1;
            }
        }
        k.add(c);
        for (int  i = 0; i < k.size()- 1; i++) {
            ans = Math.max(ans,Math.min(k.get(i),k.get(i + 1)));
            m = Math.max(m,k.get(i));
        }
        m = Math.max(m,k.get(k.size() - 1));
        if ((m / 2) > ans) {
            return m / 2;
        }
        return ans;
    }
}   

 
