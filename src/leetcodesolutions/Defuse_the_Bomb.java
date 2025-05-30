//You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.
//
//To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.
//
//If k > 0, replace the ith number with the sum of the next k numbers.
//If k < 0, replace the ith number with the sum of the previous k numbers.
//If k == 0, replace the ith number with 0.
//As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].
//
//Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!

//Constraints:
//
//n == code.length
//1 <= n <= 100
//1 <= code[i] <= 100
//-(n - 1) <= k <= n - 1




package leetcodesolutions;

public class Defuse_the_Bomb {
	class Solution {
	    public int[] decrypt(int[] code, int k) {
	        int n=code.length;
	        int[] x=new int[n];
	        if(k==0){
	            for (int i=0;i<n;i++){
	                code[i]=0;
	            }
	            return code;
	        }
	        if(k>0){
	            for(int i=0;i<n;i++){
	                int s=0;
	                for(int j=1;j<k+1;j++){
	                    int p=(i+j)%n;
	                    s=s+code[p];
	                }
	                x[i]=s;
	            }return x;
	            }
	        if(k<0){
	            int op=-1;
	            for(int i=0;i<n;i++){
	                int s=0;
	                
	                for(int j=0;j<(k*(-1));j++){
	                    int p=((n-j)+op)%n;
	                    s=s+code[p];
	                    
	                }
	                x[i]=s;
	                op++;
	            }
	            return x;
	        }
	        return x;
	        }
	    }


}
