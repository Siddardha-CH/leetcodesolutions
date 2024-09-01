package leetcodesolutions;

public class Rotate_Array {
	class Solution {
	    public void rotate(int[] nums, int k) {
	        int n=nums.length;
	        k=k%n;
	        if(n==1){
	            for(int i=0;i<n;i++){
	            nums[i]=nums[i];}
	        }
	        else{int[] nums1=new int[n];
	        int j=0;
	        for(int i=n-k;i<n;i++){
	            nums1[j]=nums[i];
	            j++;
	        }
	        for(int i=0;i<n-k;i++){
	            nums1[j]=nums[i];
	            j++;
	        }
	        for (int i=0;i<n;i++) {  
	            nums[i]=nums1[i];  
	        }  }


	        
	    }
	}

}
