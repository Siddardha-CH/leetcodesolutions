// Given a string s which consists of lowercase or uppercase letters, return the length 
// of the longest palindrome that can be built with those letters.

// Letters are case sensitive, for example, "Aa" is not considered a palindrome.


------------------------------------------------------------------------------------



  class Solution {
    public int longestPalindrome(String s) {
        int[] n = new int[26];
        int[] m = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                int k = s.charAt(i) - 'a';
                n[k] += 1;
            }
            else {
                int k = s.charAt(i) - 'A';
                m[k] += 1;
            }
            
        }
        int ans = 0;
        boolean b = true;
        for (int i : n) {
            if (i % 2 == 0) {
                ans += i;
            }
            else {
                if (b == true) {
                    ans += i;
                    b = false;
                }
                else {
                    ans += i;
                    ans -= 1;
                }
            }
        }
        for (int i : m) {
            if (i % 2 == 0) {
                ans += i;
            }
            else {
                if (b == true) {
                    ans += i;
                    b = false;
                }
                else {
                    ans += i;
                    ans -= 1;
                }
            }
        }
        return ans;
    }
}
