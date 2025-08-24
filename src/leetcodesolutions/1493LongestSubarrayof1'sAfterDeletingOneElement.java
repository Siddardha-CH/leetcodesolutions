// Given a binary array nums, you should delete one element from it.

// Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

--------------------------------------------------------------------------



  class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int c = 0;
        int i = 0;
        int n = 0;;
        int k = 0;
        while (i < nums.length) {
            if ( nums [i] == 1) {
                c += 1;
            }
            else {
                if (k == 0) {
                    n = i;
                    k = 1;
                }
                else {
                    ans = Math.max(ans,c);
                    c = 0;
                    i = n;
                    k = 0;
                }
            }
             i += 1;
        }
        ans = Math.max(ans,c);
        if (nums.length == ans) {
            return ans - 1;
        }
        return ans;
    }
}
