// Given an integer n, return any array containing n unique integers such that they add up to 0.

----------------------------------------


  class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int st = 0;
        int end = n - 1;
        int c = 1;
        if (n % 2 == 0) {
            while (st < end) {
                ans[st ++] = c;
                ans[end --] = c * -1;
                c += 1;
            }
        }
        else {
            ans[0] = 0;
            st = 1;
            while (st < end) {
                ans[st ++] = c;
                ans[end --] = c * -1;
                c += 1;
            }
        }
        return ans;
    }
}
