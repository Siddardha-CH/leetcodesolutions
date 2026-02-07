You are given an integer array nums and an integer k.

An array is considered balanced if the value of its maximum element is at most k times the minimum element.

You may remove any number of elements from nums​​​​​​​ without making it empty.

Return the minimum number of elements to remove so that the remaining array is balanced.

Note: An array of size 1 is considered balanced as its maximum and minimum are equal, and the condition always holds true.




  -------------------------------------------SOLUTION----------------------------------



  class Solution {
    public int minRemoval(int[] nums, int k) {
        // int p1 = 0;
        // int p2 = 0;
        // int n = nums.length - 1;
        Arrays.sort(nums);
        // for (int i = 0; i <= n; i++) 
        //     if (nums[i] * k >= nums[n]) {
        //         p1 = i;
        //         break;
        //     }
        // for (int i = n; i >= 0; i--) 
        //     if (nums[0] * k >= nums[i]) {
        //         p2 =  n - i;
        //         break;
        //     }
        // return Math.min(p1,p2);
        int ans = nums.length;
        int  j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && (long) nums[i] * k >= nums[j])
                j += 1;
            ans = Math.min(ans, nums.length - (j - i));
        }
        return ans;
    }
}
