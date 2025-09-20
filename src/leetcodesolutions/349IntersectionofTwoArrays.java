// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must be unique and you may return the result in any order.


-------------------------------------------------------------


  class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> k = new HashSet<>();
        for (int i : nums1) {
            k.add(i);
        }
        Set<Integer> m = new HashSet<>();
        for (int i : nums2) {
            if (k.contains(i)) {
                m.add(i);
            }
        }
        int n = 0;
        int[] ans = new int[m.size()];
        for (int i : m) {
            ans[n ++] = i;
        }
        return ans;
    }
}
