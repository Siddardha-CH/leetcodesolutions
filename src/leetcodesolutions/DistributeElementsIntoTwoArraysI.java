// You are given a 1-indexed array of distinct integers nums of length n.

// You need to distribute all the elements of nums between two arrays arr1 and arr2 using n operations. In the first operation, 
//   append nums[1] to arr1. In the second operation, append nums[2] to arr2. Afterwards, in the ith operation:

// If the last element of arr1 is greater than the last element of arr2, append nums[i] to arr1. Otherwise, append nums[i] to arr2.
// The array result is formed by concatenating the arrays arr1 and arr2. For example, if arr1 == [1,2,3] and arr2 == [4,5,6], then 
//   result = [1,2,3,4,5,6].

// Return the array result.



class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[50];
        int[] arr2 = new int[50];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int l = 1;
        int r = 1;
        for (int i = 2; i < nums.length; i++) {
            if (arr1[l - 1] > arr2[r - 1]) {
                arr1[l] = nums[i];
                l++;
            }
            else {
                arr2[r] = nums[i];
                r++;
            }
        }
        int[] res = new int[l+r];
        int a = 0;
        for (int i = 0; i < l; i++) {
            res[a] = arr1[i];
            a++;
        }
        for (int i = 0; i < r; i++) {
            res[a] = arr2[i];
            a++;
        }
        return res;
        
    }
}
