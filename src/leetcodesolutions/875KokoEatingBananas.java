// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

---------------------------------SOLUTION--------------------------------------

  class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int m = 0;
        for (int i : piles) 
            m = Math.max(i,m);    
        if (h == piles.length)     
            return m;
        int k = 1;
        while (k < m) {
            int mid = (k + m) / 2;
            int l = 0;
            for (int j = 0; j < piles.length; j++) {
                l += (int) Math.ceil((double) piles[j] / mid); 
            }
            if (l <= h) 
                m = mid;
            else 
                k = mid + 1;
        }
        return m;
    }
}
