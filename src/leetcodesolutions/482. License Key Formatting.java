// You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. 
// The string is separated into n + 1 groups by n dashes. You are also given an integer k.

// We want to reformat the string s such that each group contains exactly k characters, except for the 
// first group, which could be shorter than k but still must contain at least one character. Furthermore, 
// there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.

// Return the reformatted license key.


_________________________________SOLUTION____________________________________



  class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder p = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        int c = 0;
        p.reverse();
        String l = p.toString();
        for (char i : l.toCharArray()) {
                if (i != '-') {
                    if (c == k) {
                        c = 0;
                        ans.append('-');
                    }
                    ans.append(Character.toUpperCase(i));
                    c += 1;
                }
            }
        ans.reverse();
        return ans.toString();
    }
}
