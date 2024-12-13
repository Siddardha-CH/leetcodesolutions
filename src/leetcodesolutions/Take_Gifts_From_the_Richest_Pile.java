//You are given an integer array gifts denoting the number of gifts in various piles. Every second, you do the following:
//
//Choose the pile with the maximum number of gifts.
//If there is more than one pile with the maximum number of gifts, choose any.
//Leave behind the floor of the square root of the number of gifts in the pile. Take the rest of the gifts.
////Return the number of gifts remaining after k seconds.
////
//Constraints:
//
//1 <= gifts.length <= 103
//1 <= gifts[i] <= 109
//1 <= k <= 103


package leetcodesolutions;

public class Take_Gifts_From_the_Richest_Pile {
	
	class Solution {
	    public long pickGifts(int[] gifts, int k) {
	        
	        while(k!=0){
	            k--;
	            int j=0;
	            int max=0;
	            for(int i=0;i<gifts.length;i++){
	                if(gifts[i]>max){
	                max=gifts[i];
	                j=i;}}
	                gifts[j]=(int) Math.floor(Math.sqrt(max));
	                
	            }
	        
	        long s=0;
	         for(int i=0;i<gifts.length;i++)
	         s=s+gifts[i];
	         return s;
	    }
	}

}
