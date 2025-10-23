// You are given a string s consisting of digits. Perform the following operation repeatedly until the string has exactly two digits:

// For each pair of consecutive digits in s, starting from the first digit, calculate a new digit as the sum of the two digits modulo 10.
// Replace s with the sequence of newly calculated digits, maintaining the order in which they are computed.
// Return true if the final two digits in s are the same; otherwise, return false.


---------------------------------------------------SOLUTION -----------------------------------------------


  
  class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length() > 2) {
            String n = "";
            for (int i = 0; i < s.length() - 1; i++) {
                int k1 = s.charAt(i) - '0';
                int k2 = s.charAt(i + 1) - '0';
                int p = (k1 + k2) % 10;
                n += p;
            }
            s = n;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return true;
        }
        return false;
    }
}
