//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
//
//Constraints:
//
//0 <= num <= 231 - 1


package leetcodesolutions;

public class Add_Digits {
	class Solution {
	    public int addDigits(int num) {
	        
	        while(num>=10){
	            int s=0;
	            while(num!=0){
	                int q=num%10;
	                s=s+q;
	                num=num/10;
	            }
	            num=s;
	        }
	        
	       return num;
	    }
	}

}
