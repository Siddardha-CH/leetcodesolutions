package leetcodesolutions;

public class Container_with_most_water {
	class Solution {
	    public int maxArea(int[] height) {
	        
	         int n=height.length;
	     
	        int right =n-1;
	        int left = 0;
	        int max  =0;
	        while (right > left) {
	            max = Math.max(max, (right-left) * Math.min(height[right], height[left]));
	            if (height[right] > height[left]) {
	                left+=1;
	            } else {
	                right -=1;
	            }
	        }
	        return max;
	    }
	}

}
