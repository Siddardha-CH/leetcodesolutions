package leetcodesolutions;

public class Search_in_Rotated_Sorted_Array {
//	There is an integer array nums sorted in ascending order (with distinct values).
//
//	Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//	Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//
//	You must write an algorithm with O(log n) runtime complexity.
	
	class Solution {
	    public int search(int[] nums, int target) {
	        int n=nums.length;
	        if(n==0)
	        return -1;
	        if(nums[0]<nums[n-1]){
	            int l=0;
	            int r=n-1;
	            while(l<=r){
	                int m=l+(r-l)/2;
	                if(nums[m]==target)
	                return m;
	                if(nums[m]<target)
	                l=m+1;
	                else{
	                    r=m-1;
	                }
	            }
	            return -1;
	        }
	        else{
	        int l=0;
	        int r=n-1;
	        while(l<r){
	             int m=l+(r-l)/2;
	             if(nums[m]>nums[r]){
	                l=m+1;
	             }
	             else{
	                r=m;  
	             }
	        }
	        int s=l;
	        l=0;
	        r=n-1;
	        if(target>=nums[s]&&target<=nums[r])
	        l=s;
	        else
	        r=s-1;
	        while (l<=r){  
	            int m=l+(r-l)/2;  
	            if (nums[m]==target) {  
	                return m; 
	            } 
	            if(nums[m]<target) {  
	                l=m+1;   
	            } 
	            else{  
	                r=m-1; 
	            }  
	        }  

	        return -1;

	        }
	        }
	    }


}
