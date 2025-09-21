// Given two strings ransomNote and magazine, return true if ransomNote can be 
// constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.


--------------------------------------------------------


  class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] l1 = new int[26];
        int[] l2 = new int[26];
        int  k;
        for (int i = 0; i < ransomNote.length(); i++) {
            k = ransomNote.charAt(i) - 'a';
            l1[k] += 1;
        }
        for (int i = 0; i < magazine.length(); i++) {
            k = magazine.charAt(i) - 'a';
            l2[k] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (l1[i] > l2[i]) {
                return false;
            }
        }
        return true;
    }
}
