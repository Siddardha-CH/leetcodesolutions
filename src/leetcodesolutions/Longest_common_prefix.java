package leetcodesolutions;

public class Longest_common_prefix {
	class Solution {
	    static public String longestCommonPrefix(String[] st) {
			 if (st == null || st.length == 0) {
		            return "";
		        }
			 String p = st[0];
		        
		        for (int i = 1; i < st.length; i++) {
		            while (st[i].indexOf(p) != 0) {
		                p = p.substring(0, p.length() - 1);
		                if (p.isEmpty()) {
		                    return "";
		                }
		            }
		        }
		        return p;

		 }

		
	}

}
