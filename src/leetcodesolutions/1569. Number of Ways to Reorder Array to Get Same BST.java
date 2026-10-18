Given an array nums that represents a permutation of integers from 1 to n. We are going to construct a binary search tree (BST) by inserting the elements of nums in order into an initially empty BST. Find the number of different ways to reorder nums so that the constructed BST is identical to that formed from the original array nums.

For example, given nums = [2,1,3], we will have 2 as the root, 1 as a left child, and 3 as a right child. The array [2,3,1] also yields the same BST but [3,2,1] yields a different BST.
Return the number of ways to reorder nums such that the BST formed is identical to the original BST formed from nums.

Since the answer may be very large, return it modulo 109 + 7.





class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-18-10                                             #
        #                                                                       #
        #########################################################################
        */
    long mod = 1_000_000_007L;
    long[][] pt; //pascals triangle;
    public int numOfWays(int[] nums) {
        int n = nums.length;
        pt = new long[n + 1][];
        for (int i = 0; i <= n; i++) {
            pt[i] = new long[i + 1];
            Arrays.fill(pt[i], 1);
            for (int j = 1; j < i; j++)
                pt[i][j] = (pt[i - 1][j - 1] + pt[i - 1][j]) % mod;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums)
            list.add(i);
        long ans = func(list);
        ans -= 1;
        ans %= mod;
        return (int) ans;
    }
    public long func(ArrayList<Integer> list) {
        int n = list.size();
        if (n < 3)
            return 1; //base case
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int root = list.get(0);
        for (int i = 1; i < n; i++) {
            if (list.get(i) > root)
                right.add(list.get(i));
            else
                left.add(list.get(i));
        }
        long totl = func(left) % mod;
        long totr = func(right) % mod;
        long tot = (totl * totr) % mod;
        tot = (tot * pt[n - 1][left.size()]) % mod;
        return tot;
    }
}
