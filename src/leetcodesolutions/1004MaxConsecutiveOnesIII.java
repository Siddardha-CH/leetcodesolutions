// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.


---------------------------------------------------------------------------


  class Solution {
    public int longestOnes(int[] nums, int k) {
        int z = 0;
        int ans = 0;
        int l = 0;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i] == 0) {
                z += 1;
            }
            if (z > k) {
                for (int j = l; j  < nums.length; j ++) {
                    if (nums[j] == 0) {
                        z -= 1;
                        l = j + 1;
                        break;
                    }
                }
            }
            ans = Math.max(ans,i - l + 1);
        }
        return ans;
    }
}
