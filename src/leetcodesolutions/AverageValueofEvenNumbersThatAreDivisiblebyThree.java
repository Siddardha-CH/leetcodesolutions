iven an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.

Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.


  class Solution {
    public int averageValue(int[] nums) {
        int n = 0;
        int sum = 0;
        for (int i : nums) {
            if (i%3 == 0 && i%2 ==0) {
                n++;
                sum+=i;
            }
        } 
        if (n == 0)
        return 0;
        return sum/n;
    }
}
