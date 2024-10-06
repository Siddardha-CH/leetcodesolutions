//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//
//Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//
//Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
//Return k.

//Constraints:
//
//1 <= nums.length <= 3 * 104
//-100 <= nums[i] <= 100
//nums is sorted in non-decreasing order.



package leetcodesolutions;

public class Remove_Duplicates_From_Sorted_Array {
	
	class Solution {
	    public int removeDuplicates(int[] nums) {
	        int n=nums.length;
	        int s=0;
	        int f=s+1;
	        int k=1;
	        while(f!=n){
	            if(nums[s]!=nums[f]){
	                nums[s+1]=nums[f];
	                k++;
	                s++;
	                f++;
	                
	            }
	            else{
	                
	                f++;
	            }
	        }
	        return k;
	    }}

}
