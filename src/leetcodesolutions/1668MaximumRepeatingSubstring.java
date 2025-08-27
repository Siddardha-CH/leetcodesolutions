// For a string sequence, a string word is k-repeating if word concatenated k times is a
// substring of sequence. The word's maximum k-repeating value is the highest value k 
// where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.

// Given strings sequence and word, return the maximum k-repeating value of word in sequence

-----------------------------------------------------------------------------------------


  class Solution {
    public int maxRepeating(String sequence, String word) {
        int ans = 0;
        String n = word;
        while (sequence.contains(n)) {
            ans += 1;
            n += word;
        }
        return ans;
    }
}
