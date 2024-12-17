//You are given an integer array nums, an integer k, and an integer multiplier.
//
//You need to perform k operations on nums. In each operation:
//
//Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
//Replace the selected minimum value x with x * multiplier.
//Return an integer array denoting the final state of nums after performing all k operations.
//
//Constraints:
//
//1 <= nums.length <= 100
//1 <= nums[i] <= 100
//1 <= k <= 10
//1 <= multiplier <= 5


package leetcodesolutions;

public class Final_Array_State_After_K_Multiplication {

	
	
	class Solution {
	    public int[] getFinalState(int[] nums, int k, int multiplier) {
	        
	        while(k!=0){
	            k--;
	            int b=Arrays.stream(nums).min().getAsInt();
	            
	            for(int i=0;i<nums.length;i++){
	                if(b==nums[i]){
	                nums[i]=nums[i]*multiplier;
	                break;}
	            }

	        }
	        return nums;
	    }
	}
	
	
	
	
}
