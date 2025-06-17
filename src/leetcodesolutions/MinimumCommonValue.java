// Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. 
//   If there is no common integer amongst nums1 and nums2, return -1.

// Note : that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.


class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int c1 = 0;
        int c2 = 0;
        while ( c1 < nums1.length && c2 < nums2.length ) {
            if (nums1[c1] == nums2[c2])
            return nums1[c1];
            else if (nums1[c1] > nums2[c2])
            c2++;
            else
            c1++;

        }
        return -1;

    }
}
