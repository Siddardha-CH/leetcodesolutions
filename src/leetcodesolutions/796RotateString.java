// Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

// A shift on s consists of moving the leftmost character of s to the rightmost position.

// For example, if s = "abcde", then it will be "bcdea" after one shift.


---------------------------------------------


  class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        s += s;
        for (int i = 0; i < goal.length(); i++) {
            if (goal.equals(s.substring(i,i + goal.length()))) {
                return true;
            }
        }
        return false;
    }
}
