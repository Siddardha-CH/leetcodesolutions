package leetcodesolutions;

public class Roman_to_integer {
	class Solution {
	    public static int romanToInt(String s) {
	        int[] values = {1000, 500, 100, 50, 10, 5, 1};
	        char[] numerals = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
	        
	        int result = 0;
	        int prev = 0;
	        
	        for (int i = 0; i < s.length(); i++) {
	            int cur = 0;
	            
	            for (int j = 0; j < numerals.length; j++) {
	                if (s.charAt(i) == numerals[j]) {
	                    cur = values[j];
	                    break;
	                }
	            }
	            
	            if (cur > prev) {
	                result = result + cur - 2 * prev;
	            } else {
	                result += cur;
	            }
	            
	            prev = cur;
	        }
	        return result;
	    }
	     
	}}


