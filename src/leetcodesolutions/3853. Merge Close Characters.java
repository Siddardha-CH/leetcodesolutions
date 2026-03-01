You are given a string s consisting of lowercase English letters and an integer k.

Two equal characters in the current string s are considered close if the distance between their indices is at most k.

When two characters are close, the right one merges into the left. Merges happen one at a time, and after each merge,
the string updates until no more merges are possible.

Return the resulting string after performing all possible merges.

Note: If multiple merges are possible, always merge the pair with the smallest left index. If multiple pairs share the smallest
left index, choose the pair with the smallest right index.





  -------------------------------------------SOLUTION------------------------------------------





  class Solution {
    public String mergeCharacters(String s, int k) {
        boolean b = true;
        while (b) {
            char[] c = s.toCharArray();
            b = false;
            for (int i = 0; i < c.length; i++) {
            if (c[i] != '#')
                for (int j = i + 1; j - i <= k && j < c.length; j++) {
                    if (c[i] == c[j]) {
                        c[j] = '#';
                        b = true;
                        break;
                    } 
                }
                if (b)
                    break;
            }
                s = "";
                for (char i : c)
                    if (i != '#')
                        s += i;
        }
        return s;
    }
}   
