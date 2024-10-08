package leetcodesolutions;
//You are given a 0-indexed array of positive integers nums. Find the number of triplets (i, j, k) that meet the following conditions:
//
//0 <= i < j < k < nums.length
//nums[i], nums[j], and nums[k] are pairwise distinct.
//In other words, nums[i] != nums[j], nums[i] != nums[k], and nums[j] != nums[k].
//Return the number of triplets that meet the conditions.
// Constraints:

// 3 <= nums.length <= 100
// 1 <= nums[i] <= 1000

public class Number_of_Unequal_Triplets_in_Array {
	class Solution {
	    public int unequalTriplets(int[] nums) {
	        int count=0; 
	        int n=nums.length;
	        for(int i=0;i<n-2;i++){
	            for(int j=i+1;j<n-1;j++){
	                for(int k=j+1;k<n;k++){
	                    if(nums[i]!=nums[j]&&nums[i]!=nums[k]&&nums[j]!=nums[k]){
	                        count++;

	                    }
	                }
	            }
	        }
	        return count;
	        
	    }
	}

}
