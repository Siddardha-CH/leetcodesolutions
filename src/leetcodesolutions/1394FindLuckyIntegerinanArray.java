// Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

// Return the largest lucky integer in the array. If there is no lucky integer return -1.

________________________________________________________________________________________________________________________
   ----------------------------------------------------------------------------------------------------------------


class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int[] n = new int[501];
        int a  = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                n[arr[i]] = a;
                a = 1;
            }
            else {
                a++;
            }
        }
        n[arr[arr.length - 1]] = a;
        for (int i = 500; i > 0; i--) {
            if (i == n[i]) {
                return i;
            }
        }
        return -1;
    }
}
