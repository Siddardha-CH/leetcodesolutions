You are given an integer array nums.

An element nums[i] is considered valid if it satisfies at least one of the following conditions:

It is strictly greater than every element to its left.
It is strictly greater than every element to its right.
The first and last elements are always valid.

Return an array of all valid elements in the same order as they appear in nums.





class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-26                                             #
        #                                                                       #
        #########################################################################
        */
    public List<Integer> findValidElements(int[] nums) {
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        List<Integer> ans = new ArrayList<>();
        int m = nums[0];
        for (int i = 0; i < nums.length; i++) {
            l[i] = Math.max(m, nums[i]);
            m = l[i];
        }   
        m = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            r[i] = Math.max(m, nums[i]);
            m = r[i];
            System.out.println(r[i]);
        }
        ans.add(nums[0]);
        for (int i = 1; i < nums.length - 1; i++)
            if (nums[i] > l[i - 1] || nums[i] > r[i + 1])
                ans.add(nums[i]);
        if (nums.length > 1)
            ans.add(nums[nums.length - 1]);

        
        return ans;
    }
}
