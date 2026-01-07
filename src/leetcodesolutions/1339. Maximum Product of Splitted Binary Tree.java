// Given the root of a binary tree, split the binary tree into two subtrees by removing one edge such that the product of the sums of the subtrees is maximized.

// Return the maximum product of the sums of the two subtrees. Since the answer may be too large, return it modulo 109 + 7.

// Note that you need to maximize the answer before taking the mod and not after taking it.



________________________________________SOLUTION__________________________________________



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
    long ans = 0;
    long tot = 0;
    int m = 1000000007;
    public int maxProduct(TreeNode root) {
        tot = dfs(root);
        dfs(root);
        return (int) (ans % m);
    }
    public long dfs(TreeNode root) {
        if (root == null)
            return 0;
        long k = dfs(root.left) + dfs(root.right) + root.val;
        ans = Math.max(ans,k * (tot - k));
        return k;
    }
}
