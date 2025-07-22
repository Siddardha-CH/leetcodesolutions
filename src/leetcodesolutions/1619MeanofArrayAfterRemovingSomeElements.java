// Given an integer array arr, return the mean of the remaining integers after removing the smallest 5% and the largest 5% of the elements.

// Answers within 10-5 of the actual answer will be considered accepted.

___________________________________________________________________________________________________________________________



  class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int s = arr.length / 20;
        double sum = 0;
        for (int  i = s; i < arr.length - s; i++) 
            sum += arr[i];
        sum = sum / (arr.length - (s + s));
        return sum;
    }
}
