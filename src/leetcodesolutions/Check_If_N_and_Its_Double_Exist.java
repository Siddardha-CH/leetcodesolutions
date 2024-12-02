//Given an array arr of integers, check if there exist two indices i and j such that :
//
//i != j
//0 <= i, j < arr.length
//arr[i] == 2 * arr[j]



package leetcodesolutions;

public class Check_If_N_and_Its_Double_Exist {
	
	class Solution {
	    public boolean checkIfExist(int[] arr) {
	        for(int i=0;i<arr.length;i++){
	            for(int j=0;j<arr.length;j++){
	                if(i==j);
	                else{
	                if(arr[i]==2*arr[j])
	                return true;}

	            }
	        }return false;
	    }
	}

}
