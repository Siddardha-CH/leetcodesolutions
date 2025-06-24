// You are given a string s consisting only of uppercase English letters.

// You can apply some operations to this string where, in one operation, you can remove any 
//   occurrence of one of the substrings "AB" or "CD" from s.

// Return the minimum possible length of the resulting string that you can obtain.

// Note that the string concatenates after removing the substring and could produce new "AB" or "CD" substrings.


_____________________________________________________________________________________________________________________________________
-------------------------------------------------------------------------------------------------------------------------------------


  class Solution {
    public int minLength(String s) {
        Stack<Character> l = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!l.isEmpty() && s.charAt(i) == 'B' && l.peek() == 'A') {
                l.pop();
            }
            else if(!l.isEmpty() && s.charAt(i) == 'D' && l.peek() == 'C' ) {
                l.pop();
            }
            else {
                l.push(s.charAt(i));
            }
        }
        return l.size();
    }
}
 
