Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.






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
        #  Date        : 2026-08-24                                             #
        #                                                                       #
        #########################################################################
        */
    List<List<String>> ans = new ArrayList<>();
    List<String> sub = new ArrayList<>();
    public List<List<String>> partition(String s) {
        func(0,s);
        return ans;
    }
    public boolean ispal(String s, int l, int r) {
        while (r >= l) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l += 1;
            r -= 1;
        }
        return true;
    }
    public void func(int idx, String s) {
        if (idx == s.length()) {
            ans.add(new ArrayList<>(sub));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            if (ispal(s, idx, i)) {
                sub.add(s.substring(idx, i + 1));
                func(i + 1, s);
                sub.remove(sub.size() - 1);
            }
        }
    }
}
