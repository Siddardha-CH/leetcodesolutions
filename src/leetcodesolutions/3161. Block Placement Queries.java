There exists an infinite number line, with its origin at 0 and extending towards the positive x-axis.

You are given a 2D array queries, which contains two types of queries:

For a query of type 1, queries[i] = [1, x]. Build an obstacle at distance x from the origin. It is guaranteed that there is no obstacle at distance x when the query is asked.
For a query of type 2, queries[i] = [2, x, sz]. Check if it is possible to place a block of size sz anywhere in the range [0, x] on the line, such that the block entirely lies in the range [0, x]. A block cannot be placed if it intersects with any obstacle, but it may touch it. Note that you do not actually place the block. Queries are separate.
Return a boolean array results, where results[i] is true if you can place the block specified in the ith query of type 2, and false otherwise.






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
        #  Date        : 2026-05-30                                             #
        #                                                                       #
        #########################################################################
        */
    int[] segmentTree = new int[200000];
    int n = 50000;
    public List<Boolean> getResults(int[][] queries) {
        List<Boolean> ans = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);         // as 0 is intitial bounday

        for (int[] i : queries) {
            if (i[0] == 1) {
                int x = i[1];
                Integer high = set.higher(x);
                Integer low = set.lower(x);
                int nxt = -1;
                if (high != null)
                    nxt = high;
                int pre = -1;
                if (low != null)
                    pre = low;
                else {
                    Integer flor = set.floor(x);
                    if (flor != null)
                        pre = flor;
                }
                updatesegtree(x, x - pre, 0, 0, n - 1);
                if (nxt != -1)
                    updatesegtree(nxt, nxt - x, 0, 0, n - 1);
                set.add(x);
            }
            else {
                int x = i[1];
                int y = i[2];
                int pre = set.floor(x);
                int max = find(0, pre, 0, 0, n - 1);
                int maxi = Math.max(max, x - pre);
                if (maxi >= y)
                    ans.add(true);
                else
                    ans.add(false);
            }
        }
        return ans;
    }
    public int find(int st, int end, int i, int l, int r) {
        if (l > end || r < st)
            return 0;
        if (l >= st && r <= end)
            return segmentTree[i];
        int m = (l + r) / 2;
        return Math.max(find(st, end, 2 * i + 1, l, m), find(st, end, 2 * i + 2, m + 1, r));
    } 
    public void updatesegtree(int idx, int val, int i, int l, int r) {
        if (l == r) {
            segmentTree[i] = val;
            return;
        }
        int m = (l + r) / 2;

        if (idx <= m)
            updatesegtree(idx, val, 2 * i + 1, l, m);
        else
            updatesegtree(idx, val, 2 * i + 2, m + 1, r);
        
        segmentTree[i] = Math.max(segmentTree[2 * i + 1], segmentTree[2 * i + 2]);
    }
}
