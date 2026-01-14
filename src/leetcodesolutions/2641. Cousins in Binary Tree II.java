// Given the root of a binary tree, replace the value of each node in the tree with the sum of all its cousins' values.

// Two nodes of a binary tree are cousins if they have the same depth with different parents.

// Return the root of the modified tree.

// Note that the depth of a node is the number of edges in the path from the root node to it.


-----------------------------------------------SOLUTION-----------------------------------------



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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        root.val = 0;
        q.add(root);
        while (!q.isEmpty()) {
            int s = 0;
            int size = q.size();
            Queue<TreeNode> lq = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.remove();
                lq.add(temp);
                if (temp.left != null) {
                    q.add(temp.left);
                    s += temp.left.val;
                }
                if (temp.right != null) {
                    q.add(temp.right);
                    s += temp.right.val;
                }
            }
            for (TreeNode temp : lq) {
                int n = s;
                if (temp.left != null)
                    n -= temp.left.val;
                if (temp.right != null)
                    n -= temp.right.val;
                if (temp.left != null)
                    temp.left.val = n;
                if (temp.right != null)
                    temp.right.val = n;
            }
        }
        return root;
    }
}
