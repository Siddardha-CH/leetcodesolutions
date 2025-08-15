// Given a binary array nums, return the maximum number of consecutive 1's in the array.

___________________________________________________________________


  class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int a = 0;
        int c = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1) {
                a += 1;
                if (nums[i] == nums[i + 1]) {
                    c += 1;
                }
            }
            else {
                ans = Math.max(c,ans);
                c = 1;
            }
        }
        if (nums[nums.length - 1] == 1) {
            a = 1;
        }
        ans = Math.max(c,ans);
        if (a == 0) {
            return 0;
        }
        return ans;
    }
}
