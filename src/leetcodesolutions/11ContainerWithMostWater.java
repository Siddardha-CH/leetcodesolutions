// You are given an integer array height of length n. There are n vertical lines drawn 
// such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

---------------------------------------------------------------------


  class Solution {
    public int maxArea(int[] height) {
        int r = height.length - 1;
        int  l = 0;
        int ans = 0;
        while (r > l) {
            int k = Math.min(height[l],height[r]);
            ans = Math.max(ans, (r - l) * k);
            if (height[r] > height[l]) 
            {
                l += 1;
            }
            else {
                r -= 1;
            }
        }
        return ans;
    }
}
