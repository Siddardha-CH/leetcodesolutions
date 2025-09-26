// Given a string s, return the longest palindromic substring in s.


--------------------------------------------------


  class Solution {
    public String longestPalindrome(String s) {
        int st = 0;
        int end = 0;
        for (int  i = 0;i < s.length(); i ++) {
            for (int j = i; j<s.length();j++) {
                if (ispal(s,i,j)) {
                    int  l = j - i + 1;
                    if (end < l) {
                        end = l;
                        st = i;
                    }
                }
            }
        }
        String ans ="";
        for (int i = st; i< st + end;  i++) {
            ans += s.charAt(i);
        }
        return ans; 
    }
    boolean ispal(String k,int i, int j) {
        while (i < j) {
            if (k.charAt(i) != k.charAt(j)) {
                return false;
            }
            i ++;
            j --;
        }
        return true;
    }
}
