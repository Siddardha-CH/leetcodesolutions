
//Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.
//
//Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.
//
//A prefix of a string s is any leading contiguous substring of s.

package leetcodesolutions;

public class Check_If_a_Word_Occurs_As_Prefix {
	class Solution {
	    public int isPrefixOfWord(String sentence, String searchWord) {
	        String[] words=new String[100];
	        String p="";
	        int a=0;
	        for(int i=0;i<sentence.length();i++){
	            if(sentence.charAt(i) != ' '){
	                p=p+sentence.charAt(i);
	            }
	            else{
	                if(!p.isEmpty()){
	                words[a]=p;
	                a++;
	                }p="";
	                
	            }
	            
	        }if (!p.isEmpty()) {
	            words[a] = p;
	            a++;
	        }

	        for (int i = 0; i < a; i++) {
	            if (words[i].startsWith(searchWord)) {
	                return i + 1; 
	            }
	        }

	       
	        return -1;
	        
	    }
	}
	
	
	
	class Solution {
	    public int isPrefixOfWord(String sentence, String searchWord) {
	        String arr[]=sentence.split(" ");
	        for(int i=0;i<arr.length;i++){
	            if(arr[i].startsWith(searchWord))
	            return i+1;
	        }
	        return -1;
	    }
	}

}
