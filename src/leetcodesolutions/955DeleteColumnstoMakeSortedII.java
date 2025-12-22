// You are given an array of n strings strs, all of the same length.

// We may choose any deletion indices, and we delete all the characters in those indices for each string.

// For example, if we have strs = ["abcdef","uvwxyz"] and deletion indices {0, 2, 3}, then the final array after deletions is ["bef", "vyz"].

// Suppose we chose a set of deletion indices answer such that after deletions, the final array has its elements in lexicographic order 
// (i.e., strs[0] <= strs[1] <= strs[2] <= ... <= strs[n - 1]). Return the minimum possible value of answer.length.




__________________________________________SOLUTION__________________________________________




  class Solution {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        int n = strs.length;
        int m = strs[0].length();
        boolean[] b = new boolean[n - 1];
        for (int c = 0; c < m; c++) {
            boolean k = false;
            for (int r = 0; r < n - 1; r++) {
                if (!b[r] && strs[r].charAt(c) > strs[r + 1].charAt(c)) {
                    k = true;
                    break;
                }
            }
            if (k) {
                ans += 1;
                continue;
            }
            for (int r = 0; r < n -1; r++) {
                if (!b[r] && strs[r].charAt(c) < strs[r + 1].charAt(c))
                    b[r] = true;
            }
        }
        return ans;
    }
}
