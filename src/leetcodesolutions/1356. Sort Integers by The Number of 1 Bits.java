You are given an integer array arr. Sort the integers in the array in ascending order by the number of 
1's in their binary representation and in case of two or more integers have the same number of 1's you
have to sort them in ascending order.

Return the array after sorting it.



-----------------------------------------SOLUTION--------------------------------------------



class Solution {
    public int[] sortByBits(int[] arr) {
        int[] k = new int[arr.length];
        for (int i =0; i < arr.length; i++) 
            k[i] = Integer.bitCount(arr[i]);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int  j = i + 1; j < arr.length; j++) {
                if (k[i] > k[j] || (k[i] == k[j] && arr[i] > arr[j])) {
                    int t = k[j];
                    k[j] = k[i];
                    k[i] = t;
                    t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t; 
                }
            }
        }
        return arr;
    }
}
