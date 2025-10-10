// Given a string s, reverse the string according to the following rules:

// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.
// Return s after reversing it.

----------------------------------------------


  class Solution {
    public String reverseOnlyLetters(String s) {
        int st = 0;
        int end = s.length() - 1;
        String p = "";
        String ans = "";
        ArrayList<Character> k = new ArrayList<>();
        for (int i = 0 ; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                k.add(s.charAt(i));
            }
            else {
                p += s.charAt(i); 
            }
        }
        int i = p.length() - 1;
        int j = 0;
        System.out.println(k);
        System.out.println(p);
        for (int n = 0; n < s.length(); n++) {
            if (Character.isLetter(s.charAt(n))) {
                ans += p.charAt(i --);
            }
            else {
                ans += k.get(j ++);
            }
        }
        return ans;
    }
}
