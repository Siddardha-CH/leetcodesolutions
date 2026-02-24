You are given the root of a binary tree where each node has a value 0 or 1. Each root-to-leaf path represents a binary number starting with the most significant bit.

For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
For all leaves in the tree, consider the numbers represented by the path from the root to that leaf. Return the sum of these numbers.

The test cases are generated so that the answer fits in a 32-bits integer.






  -----------------------------------------------------SOLUTION----------------------------------------------------




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
    public int sumRootToLeaf(TreeNode root) {
        int k = dfs(root, 0);
        return k;
    }
    public int dfs(TreeNode root, int sum) {
        if (root == null)
            return 0;
        sum *= 2;
        sum += root.val;
        if (root.left == null  && root.right == null)
            return sum;
        return dfs(root.left, sum) + dfs(root.right, sum);
    }
}
