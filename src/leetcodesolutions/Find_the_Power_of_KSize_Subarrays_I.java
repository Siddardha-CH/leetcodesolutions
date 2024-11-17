//You are given an array of integers nums of length n and a positive integer k.
//
//The power of an array is defined as:
//
//Its maximum element if all of its elements are consecutive and sorted in ascending order.
//-1 otherwise.
//You need to find the power of all 
//subarrays
// of nums of size k.
//
//Return an integer array results of size n - k + 1, where results[i] is the power of nums[i..(i + k - 1)].
//

//Constraints:
//
//1 <= n == nums.length <= 500
//1 <= nums[i] <= 105
//1 <= k <= n



package leetcodesolutions;

public class Find_the_Power_of_KSize_Subarrays_I {
	class Solution {
	    public int[] resultsArray(int[] nums, int k) {
	        int n=nums.length;
	        int[] x=new int[n - k + 1];
	        if (k==1){
	            for(int i=0;i<n;i++){
	                x[i]=nums[i];
	            }
	            return x;}
	           
	        for (int i = 0; i <= n - k; i++){
	            int s=nums[i];
	            
	            for(int j=i+1;j<i+k;j++){
	                if(nums[j]==s+1){
	                    s=nums[j];
	                    x[i]=s;
	                }
	                
	                else{
	                x[i]=-1;
	                break;}
	            }
	           
	        }
	        return x;

	    }
	}
}
