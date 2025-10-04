// You are given a string s and an integer k. You can choose any character of the string and 
// change it to any other uppercase English character. You can perform this operation at most k times.

// Return the length of the longest substring containing the same letter you can get after performing the above operations.


-----------------------------------------------------------------------------


  class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int ans = 0, max = 0, l = 0;
        for (int r = 0; r < s.length(); r++) {
            freq.put(s.charAt(r),freq.getOrDefault(s.charAt(r),0) + 1);
            max = Math.max(max,freq.get(s.charAt(r)));
            int  len = (r - l + 1) - max;
            while (len > k) {
                freq.put(s.charAt(l),freq.get(s.charAt(l)) - 1);
                l += 1;
                len = (r - l + 1) - max;
            }
            ans = Math.max(ans,r - l + 1);
        }
        return ans;
    }
}
