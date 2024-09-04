package leetcodesolutions;

public class Count_Square_Sum_Triples {
//	A square triple (a,b,c) is a triple where a, b, and c are integers and a2 + b2 = c2.
//
//			Given an integer n, return the number of square triples such that 1 <= a, b, c <= n.

// Constraints:
// 1 <= n <= 250
	class Solution {
	    public int countTriples(int n) {
	        int count=0;
	        for(int i=0;i<n-1;i++){
	            for(int j=i+1;j<n;j++){
	                for(int k=j+1;k<=n;k++){
	                    if((i*i)+(j*j)==(k*k))
	                    count++;
	                }
	            }
	        }
	        return count*2;
	        
	    }
	}

}
