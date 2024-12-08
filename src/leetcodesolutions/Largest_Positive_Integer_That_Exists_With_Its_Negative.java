//Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists 
//in the array.
//
//Return the positive integer k. If there is no such integer, return -1.



package leetcodesolutions;


public class Largest_Positive_Integer_That_Exists_With_Its_Negative {
	
	class Solution {
	    public int findMaxK(int[] nums) {
	        int a=-1;
	        for(int i=0;i<nums.length;i++){
	            int p=-1;
	            for(int j=0;j<nums.length;j++){
	                if(nums[i]==-1*nums[j])
	                p=Math.abs(nums[i]);
	            }
	            a=Math.max(a,p);  
	        }
	        return a;
	    }
	}

}
