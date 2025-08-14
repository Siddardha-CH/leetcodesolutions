// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

_________________________________________________________



  class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while ( l < r) {
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            l += 1;
            r -= 1;
        }
    }
}
