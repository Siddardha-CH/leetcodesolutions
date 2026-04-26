You are given a bitonic array nums of length n.

Split the array into two parts:

Ascending part: from index 0 to the peak element (inclusive).
Descending part: from the peak element to index n - 1 (inclusive).
The peak element belongs to both parts.

Return:

0 if the sum of the ascending part is greater.
1 if the sum of the descending part is greater.
-1 if both sums are equal.
Notes:

A bitonic array is an array that is strictly increasing up to a single peak element and then strictly decreasing.
An array is said to be strictly increasing if each element is strictly greater than its previous one (if exists).
An array is said to be strictly decreasing if each element is strictly smaller than its previous one (if exists).




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
    public int compareBitonicSums(int[] nums) {
        int l = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                l = i - 1;
                break;
            }
        }
        long p = 0;
        for (int i = 0; i < l; i++)
            p += nums[i];
        for (int i = l + 1; i < nums.length; i++)
            p -= nums[i];
        System.out.println(p);
        if (p == 0)
            return -1;
        if (p > 0)
            return 0;
        return 1;
    }
}
