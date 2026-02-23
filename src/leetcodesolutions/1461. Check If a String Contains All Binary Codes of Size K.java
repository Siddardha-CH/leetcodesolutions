Given a binary string s and an integer k, return true if every binary code of length k is a substring of s. Otherwise, return false.






  ------------------------------------------SOLUTION-------------------------------------------



  class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = 1;
        for (int i = 1; i <= k ; i++)
            n *= 2;
        if (s.length() < k)
            return false;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) 
            set.add(s.substring(i, i + k));
        if (set.size() == n)
            return true;
        return false;
    }
}
