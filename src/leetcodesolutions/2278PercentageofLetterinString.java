// Given a string s and a character letter, return the percentage 
// of characters in s that equal letter rounded down to the nearest whole percent.

__________________________________________________________________________________



  class Solution {
    public int percentageLetter(String s, char letter) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                ans += 1;
            }
        }
        return (ans * 100) / s.length() ;
    }
}
