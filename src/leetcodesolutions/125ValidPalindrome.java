// A phrase is a palindrome if, after converting all uppercase letters into lowercase 
//   letters and removing all non-alphanumeric characters, it reads the same forward and 
//   backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

_____________________________________________________________________________________




  class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        ArrayList<Character> arr = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                arr.add(c);
            }
        }
        System.out.println(arr);
        int a = 0;
        int b = arr.size() - 1;
        while (a < b) {
            if (arr.get(a) != arr.get(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
