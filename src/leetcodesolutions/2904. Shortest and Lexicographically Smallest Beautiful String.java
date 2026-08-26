You are given a binary string s and a positive integer k.

A substring of s is beautiful if the number of 1's in it is exactly k.

Let len be the length of the shortest beautiful substring.

Return the lexicographically smallest beautiful substring of string s with length equal to len. If s doesn't contain a beautiful substring, return an empty string.

A string a is lexicographically larger than a string b (of the same length) if in the first position where a and b differ, a has a character strictly larger than the corresponding character in b.

For example, "abcd" is lexicographically larger than "abcc" because the first position they differ is at the fourth character, and d is greater than c.






class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-08-25                                             #
        #                                                                       #
        #########################################################################
        */
    public String shortestBeautifulSubstring(String s, int k) {
        List<String> list = new ArrayList<>();
        int l = 0;
        int c = 0;
        for (int r = 0; r < s.length(); r++) {
            if (s.charAt(r) == '1') {
                c += 1;
                while (c > k) {
                    if (s.charAt(l) == '1')
                        c -= 1;
                    l += 1;
                }
                if (c == k) {
                    while (s.charAt(l) == '0')
                        l += 1;
                    list.add(s.substring(l, r + 1));
                }
            }
        }
        if (list.size() == 0)
            return "";
        String ans = list.get(0);
        for (String i : list) {
            if (i.length() < ans.length() || (ans.length() == i.length() &&  ans.compareTo(i) > 0))
                ans = i;
        }
        return ans;
    }
}
