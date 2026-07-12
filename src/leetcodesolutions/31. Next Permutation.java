A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.









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
        #  Date        : 2026-07-12                                             #
        #                                                                       #
        #########################################################################
        */
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        for (int i = n - 2; i > -1; i--)
            if (nums[i] < nums[i + 1]) {        // BREAK POINT
                idx = i;
                break;
            }
        if (idx == -1) {                        // IF NO BREAK POINT ITS THE LAST PERMUTATION NOW WE REVERSE TO SORTED ORDER
            rev(nums, 0, n - 1);
            return;
        }
        for (int i = n -1; i > idx; i--)        // SWAPING THE BREAK POINT WITH MIN NEXT NUM 
            if (nums[i] > nums[idx]) {
                int t = nums[i];
                nums[i] = nums[idx];
                nums[idx] = t;
                break;
            }
        rev(nums, idx + 1, n - 1);              // REV FROM BREAK POINT TO END
        
    }
    public void rev(int[] nums, int l, int r) {
        while (r > l) {
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l += 1;
            r -= 1;
        }
    }
}
