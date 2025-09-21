// Given a string s, find the length of the longest substring without duplicate characters.


--------------------------------------------------------


  class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int a = 0;
        String k ;
        int c = 0;
        int ans = 0;
        while (a < s.length()) {
            k = "";
            c = 0;
            for (int  i = a; i< s.length(); i++) {
                if (k.indexOf(s.charAt(i)) >= 0) {
                    ans = Math.max(ans,c);
                    break;
                }
                else {
                    k += s.charAt(i);
                    c += 1;
                }
            }
            ans = Math.max(ans,c);
            a += 1;
        }
        return ans;
    }
}
