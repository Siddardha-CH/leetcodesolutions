// Given a string s, find the length of the longest substring without duplicate characters.


____________________________________SOLUTION___________________________________





  class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int l  =0; 
        int ans = 0;
        for (int r = 0; r < s.length(); r++) {
            char k = s.charAt(r);
            if (map.containsKey(k) && map.get(k) >= l) 
                l = map.get(k) + 1;
            ans = Math.max(ans,r - l + 1);
            map.put(k,r);
        }
        return ans;
    }
}
