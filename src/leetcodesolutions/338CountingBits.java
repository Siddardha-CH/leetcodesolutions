// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.


-------------------------------------------------------

  class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        int index = 0;
        for (int i = 0; i <= n; i++) {
            int p = i;
            ArrayList<Integer> k = new ArrayList<>();
            while (p > 0) {
                k.add(p % 2);
                p /= 2;
            }
            int c = 0;
            for (int j = 0; j < k.size(); j++) {
                if (k.get(j) == 1) {
                    c += 1;
                }
            }
            ans[index++] = c;
        }
        return ans;
    }
}
