You are given a tree with n nodes numbered from 0 to n - 1 in the form of a parent array parent where parent[i] is the parent of ith node. The root of the tree is node 0. Find the kth ancestor of a given node.

The kth ancestor of a tree node is the kth node in the path from that node to the root node.

Implement the TreeAncestor class:

TreeAncestor(int n, int[] parent) Initializes the object with the number of nodes in the tree and the parent array.
int getKthAncestor(int node, int k) return the kth ancestor of the given node node. If there is no such ancestor, return -1.






class TreeAncestor {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-06-13                                             #
        #                                                                       #
        #########################################################################
        */
        int cols;
        int[][] up;

    public TreeAncestor(int n, int[] parent) {
        String s = Integer.toBinaryString(n);
        cols =0 ;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '1') {
                cols = s.length() - i;
                break;
            }
                
        up = new int[n][cols];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < cols; j++)
                up[i][j] = -1;

        for (int i = 0; i < n; i++)
            up[i][0] = parent[i];

        for (int j = 1; j < cols; j++)
            for (int i = 0; i < n; i++) {
                int k = up[i][j - 1];
                if (k != -1)
                    up[i][j] = up[k][j - 1];
            }
    }
    
    public int getKthAncestor(int node, int k) {
        String s = Integer.toBinaryString(k);
        int len = s.length() - 1;
        for (int i = len; i >= 0; i--) {
            if (s.charAt(i) == '0')
                continue;
            node = up[node][len - i];
            if (node == -1)
                return -1;
        }
        return node;
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */
