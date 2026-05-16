Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

[4,5,6,7,0,1,4] if it was rotated 4 times.
[0,1,4,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

You must decrease the overall operation steps as much as possible.






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
        #  Date        : 2026-05-16                                             #
        #                                                                       #
        #########################################################################
        */
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (r > l) {
            int m = (l + r) / 2;
            if (nums[m] > nums[r])
                l = m + 1;
            else 
                r -= 1; // we canot determine if both elementsb are equal where to move so reduce r by 1 
        }
        return nums[r];
    }
}
