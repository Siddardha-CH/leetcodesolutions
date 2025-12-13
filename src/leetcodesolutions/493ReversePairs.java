// Given an integer array nums, return the number of reverse pairs in the array.

// A reverse pair is a pair (i, j) where:

// 0 <= i < j < nums.length and
// nums[i] > 2 * nums[j].



______________________________________SOLUTION______________________________________




  class Solution {
    int ans = 0;
    public int reversePairs(int[] nums) {
        ms(nums,0,nums.length - 1);
        return ans;
    }
    public void ms(int[] nums,int l,int r) {
        int m = l + (r - l) / 2;
        if (l < r) {
            ms(nums,l,m);
            ms(nums,m + 1,r);
            merge(nums,l,m,r);
        }
        else {
            return;
        }
    }
    public void merge(int[] nums, int l, int m , int r) {
        int[] n1 = new int[m - l + 1];;
        int[] n2 = new int[r - m];
        int i = l;
        int j = m + 1;
        while (i <= m && j <= r) {
            if ((long)nums[i] > (long)2 * nums[j]) {
                ans += (m - i + 1);
                j += 1;
            }
            else {
                i += 1;
            }
        }
        int k = 0;
        for ( i = l; i <= m; i++)
            n1[k++] = nums[i];
        k = 0;
        for ( i = m + 1; i <= r; i++)
            n2[k++] = nums[i];
        k = l;
        i = 0;
        j = 0;
        while (i < n1.length && j < n2.length) {
            if (n1[i] > n2[j])
                nums[k++] = n2[j++];
            else 
                nums[k++] = n1[i++];
        }
        while (i < n1.length)
            nums[k++] = n1[i++];
        while (j < n2.length)
            nums[k++] = n2[j++];
        
    }

}
