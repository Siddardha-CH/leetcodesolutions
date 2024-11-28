//A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
//
//You are given an array of strings sentences, where each sentences[i] represents a single sentence.
//
//Return the maximum number of words that appear in a single sentence
//
//Constraints:
//
//1 <= sentences.length <= 100
//1 <= sentences[i].length <= 100
//sentences[i] consists only of lowercase English letters and ' ' only.
//sentences[i] does not have leading or trailing spaces.
//All the words in sentences[i] are separated by a single space.




package leetcodesolutions;

public class Maximum_Number_of_Words_Found_in_Sentences {
	
	class Solution {
	    public int mostWordsFound(String[] sentences) {
	        int n=sentences.length;
	        int s=0;
	        for(int i=0;i<n;i++){
	            int a=sentences[i].length();
	            int m=0;
	            for(int j=0;j<a;j++){
	                if(sentences[i].charAt(j)==' ')
	                m++;
	            }
	            int b=m+1;
	            s=Math.max(s,b);
	        }
	      return s;  
	    }
	}

}
