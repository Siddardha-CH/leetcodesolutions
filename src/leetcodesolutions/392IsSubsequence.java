// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by 
// deleting some (can be none) of the characters without disturbing the relative positions 
// of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).


-------------------------------------------------------------------


  class Solution {
    public boolean isSubsequence(String s, String t) {
        // int c=0;
        // int k=0;
        // for(int i=0;i<s.length();i++){
        //     for(int j=k;j<t.length();j++){
        //         if(s.charAt(i)==t.charAt(j)){
        //             c++;
        //             k=j+1;
        //             break;}
        //     }
        // }
        // System.out.println(c);
        // if (c==s.length())
        // return true;
        // return false;
        int index = 0;
        for (int  i =0; i < t.length(); i++) {
            if (index == s.length()) {
            return true;
        }
            if (t.charAt(i) == s.charAt(index)) {
                index += 1;
            }
        }
        if (index == s.length()) {
            return true;
        }
        return false;
    }
}
