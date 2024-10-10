//A parentheses string is valid if and only if:
//
//It is the empty string,
//It can be written as AB (A concatenated with B), where A and B are valid strings, or
//It can be written as (A), where A is a valid string.
//You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.
//
//For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
//Return the minimum number of moves required to make s valid.
//Constraints:
//
//1 <= s.length <= 1000
//s[i] is either '(' or ')'.
package leetcodesolutions;

public class Minimum_Add_to_Make_Parentheses_Valid {
	class Solution {
	    public int minAddToMakeValid(String s) {
	        Stack<Character> a = new Stack<>();
	        int x=0;
	        
	       for(int i=0;i<s.length();i++){
	        char p=s.charAt(i);
	        
	        if(p=='('){
	            a.push(p);
	            x++;
	        }
	        if(p==')'){
	            if(a.size() > 0 && a.peek()=='('){
	            a.pop();
	            x--;}
	            else
	            x++;
	        }

	       }
	       return x;
	        
	    }
	}

}
