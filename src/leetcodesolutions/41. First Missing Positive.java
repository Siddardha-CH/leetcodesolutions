Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.




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
        #  Date        : 2026-07-11                                             #
        #                                                                       #
        #########################################################################
        */
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;



        //  CYCLIC SORT - used when there is a range known; 


        for (int i = 0; i < n; i++) {                   
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                int t = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[t];
                nums[t] = temp;
            }
        }
        for (int i = 0; i < n; i++)
            if (nums[i] != i + 1)
                return i + 1;
        return n + 1;
    }
}
