You are given two non-increasing 0-indexed integer arrays nums1​​​​​​ and nums2​​​​​​.

A pair of indices (i, j), where 0 <= i < nums1.length and 0 <= j < nums2.length, is valid if both i <= j and nums1[i] <= nums2[j]. The distance of the pair is j - i​​​​.

Return the maximum distance of any valid pair (i, j). If there are no valid pairs, return 0.

An array arr is non-increasing if arr[i-1] >= arr[i] for every 1 <= i < arr.length.




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
        #  Date        : 2026-04-19                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans = 0;
        int n = nums1.length;
        for (int i = 0; i < n; i++) 
            ans = Math.max(ans, maxdis(i, nums2.length - 1, nums1[i], nums2));
        
        return ans;
    }
    public int maxdis(int l , int r, int v, int[] nums) {
        int st = l;
        while (r >= l) {
            int m = (l + r) / 2;
            if (nums[m] >= v)
                l = m + 1;
            else
                r = m - 1;
        }
        return r - st; 
    }
}
