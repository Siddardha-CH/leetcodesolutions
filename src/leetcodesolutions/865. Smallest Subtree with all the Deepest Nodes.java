// Given the root of a binary tree, the depth of each node is the shortest distance to the root.

// Return the smallest subtree such that it contains all the deepest nodes in the original tree.

// A node is called the deepest if it has the largest depth possible among any node in the entire tree.

// The subtree of a node is a tree consisting of that node, plus the set of all descendants of that node.



-----------------------------------SOLUTION------------------------------------------



  /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode ans = null;
    int d = 0;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        dfs(root,0);
        return ans;
    }
    public int dfs(TreeNode root,int lev) {
        d = Math.max(d,lev);
        if (root == null)
            return lev;
        int l = dfs(root.left,lev + 1);
        int r = dfs(root.right, lev + 1);
        if (l == r && l == d) 
            ans = root;   
        return Math.max(l,r);
    }
}
