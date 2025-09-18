// Given two strings a and b, return the minimum number of times you should repeat string a so that string 
// b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.

// Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".


----------------------------------------------------------------------


  class Solution {
    public int repeatedStringMatch(String a, String b) {
        String c = a;
        int ans = 1;
        while (a.length() < b.length()) {
            a += c;
            ans += 1;
        }
        if (a.contains(b)) {
            return ans;
        }
        a += c;
        ans += 1;
        if (a.contains(b)) {
            return ans;
        }
        return -1;
    }
}
