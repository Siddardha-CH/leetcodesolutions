Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.






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
        #  Date        : 2026-09-01                                             #
        #                                                                       #
        #########################################################################
        */
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (true) {
            fast = nums[nums[fast]]; // basically moving 2 times
            slow = nums[slow]; // moving 1 time
            if (slow == fast)
                break; //  finding common point
        }
        slow = 0; // start from slow and  find common 
        while (true) {
            slow = nums[slow];
            fast = nums[fast];
            if (slow == fast)
                return slow;
        }
    }
}
