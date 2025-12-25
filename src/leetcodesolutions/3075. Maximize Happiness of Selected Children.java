// You are given an array happiness of length n, and a positive integer k.

// There are n children standing in a queue, where the ith child has happiness value happiness[i]. 
// You want to select k children from these n children in k turns.

// In each turn, when you select a child, the happiness value of all the children that have not been selected till
// now decreases by 1. Note that the happiness value cannot become negative and gets decremented only if it is positive.

// Return the maximum sum of the happiness values of the selected children you can achieve by selecting k children.





______________________________________SOLUTION____________________________________




  class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        long ans = 0;
        int c = 0;
        Arrays.sort(h);
        for (int i = h.length - 1; i >= h.length - k; i--) {
            if (h[i] - c > 0) 
                ans += h[i];
            else
                break;
            ans -= c;
            c += 1;
        }
        return ans;
    }
}
