// Given a positive integer n, find the pivot integer x such that:

// The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
// Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most 
// one pivot index for the given input.

 class Solution {
    public int pivotInteger(int n) {
        int l = 1;
        int r = n;
        int sum1 = 1;
        int sum2 = n;
        while (l < r) {
            if (sum1 > sum2) {
                r--;
                sum2+=r;
            }
            else {
                l++;
                sum1+=l;
            }
            System.out.println(sum1 + " " + sum2);
        }
        if (sum1 == sum2) {
            return l;
        }
        return -1;
    }
}

