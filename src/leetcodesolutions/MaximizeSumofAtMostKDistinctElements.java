// You are given a positive integer array nums and an integer k.

// Choose at most k elements from nums so that their sum is maximized. However, the chosen numbers must be distinct.

// Return an array containing the chosen numbers in strictly descending order.

// Note: Please do not copy the description during the contest to maintain the integrity of your submissions.


--------------------------------------------


  class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        if (nums.length == 2) {
            if (nums[0] != nums[1] && k >1) {
                if (nums[1] > nums[0]) {
                    int temp = nums[1];
                    nums[1] = nums[0];
                    nums[0] = temp;
                }
                return nums;
            }
        }
        int[] ans = new int[k];
        int[] c = new int[nums.length];
        Arrays.sort(nums);
        int a = 0;
        c[a ++] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i --) {
            if (c[a - 1] != nums[i]) {
                c[a ++] = nums[i];
            }
        } 
        a = 0;
        for (int  i =0; i < k; i++) {
            ans[i] = c[i];
            if (ans[i] > 0) {
                a ++;
            }
        }
        System.out.println(a);
        int[] answer = new int[a];
        for ( int i = 0; i< a; i ++) {
            answer[i] = ans[i];
        }
        return answer;
    }
}
