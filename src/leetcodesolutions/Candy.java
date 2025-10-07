// There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

// You are giving candies to these children subjected to the following requirements:

// Each child must have at least one candy.
// Children with a higher rating get more candies than their neighbors.
// Return the minimum number of candies you need to have to distribute the candies to the children.



------------------------------------------------------------------------



  class Solution {
    public int candy(int[] ratings) {
        int ans = 0;
        int[] k1 = new int[ratings.length];
        int[] k2 = new int[ratings.length];
        k1[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                k1[i] = k1[i - 1] + 1;
            }
            else {
                k1[i] = 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                k1[i] = Math.max(k1[i],k1[i + 1] + 1);
            }
        }
        for (int i : k1) {
            ans += i;
        }
        return ans;
    }
}
