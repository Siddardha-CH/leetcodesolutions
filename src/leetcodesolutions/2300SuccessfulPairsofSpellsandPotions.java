// You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of 
// the ith spell and potions[j] represents the strength of the jth potion.

// You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.

// Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.


-----------------------------------------------------------------------


  class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        long max;
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int l = 0;
            int r = potions.length - 1;
            boolean b = false;
            while (l <= r) {
                int mid = (l + r) /2;
                long k = (long) potions[mid] * spells[i];
                if (k >= success) {
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
            ans[i] = potions.length - l;
        } 
        return ans;
    }
}
