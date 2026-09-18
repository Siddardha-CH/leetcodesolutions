Given a string s of lowercase letters, you need to find the maximum number of non-empty substrings of s that meet the following conditions:

The substrings do not overlap, that is for any two substrings s[i..j] and s[x..y], either j < x or i > y is true.
A substring that contains a certain character c must also contain all occurrences of c.
Find the maximum number of substrings that meet the above conditions. If there are multiple solutions with the same number of substrings, return the one with minimum total length. It can be shown that there exists a unique solution of minimum total length.

Notice that you can return the substrings in any order.





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
        #  Date        : 2026-18-08                                             #
        #                                                                       #
        #########################################################################
        */
    public List<String> maxNumOfSubstrings(String s) {
        List<String> ans = new ArrayList<>();
        int[] st = new int[26];
        int[] end = new int[26];
        boolean[] val = new boolean[26];
        Arrays.fill(st, -1);
        Arrays.fill(val, true);
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (st[idx] == -1)
                st[idx] = i;
            end[idx] = i;
        }
        for (int i = 0; i < 26; i++) {
            if (st[i] == -1)
                continue;
            for (int j = st[i]; j <= end[i]; j++) {
                int idx = s.charAt(j) - 'a';
                if (st[i] > st[idx]) {
                    val[i] = false;
                    break;
                }
                end[i] = Math.max(end[i], end[idx]);
            }
        }
        int laststart = 1000000;
        for (int i = s.length() - 1; i >= 0; i--) {
            int idx = s.charAt(i) - 'a';
            if (!val[idx])
                continue;
            if (i == st[idx] && laststart > end[idx]) {
                ans.add(s.substring(i, end[idx] + 1));
                laststart = i;
            }
        }
        return ans;
    }
}
