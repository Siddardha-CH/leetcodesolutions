
// Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.

// Two nodes of a binary tree are cousins if they have the same depth with different parents.

// Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.



-----------------------------SOLUTION-----------------------------------



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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();     
        q.add(root);
        while (!q.isEmpty()) {
            boolean xf = false;
            boolean yf = false;
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode  temp = q.remove();
                if (temp.left != null && temp.right != null)
                    if ((temp.left.val == x && temp.right.val == y) || (temp.left.val == y && temp.right.val == x))
                        return false;
                if (temp.left != null) {
                    q.add(temp.left);
                    if (temp.left.val == x) 
                        xf = true;
                    if (temp.left.val == y)
                        yf = true;
                }
                if (temp.right != null) {
                    q.add(temp.right);
                    if (temp.right.val == x) 
                        xf = true;
                    if (temp.right.val == y)
                        yf = true;
                }
            }
            if (xf && yf)
                return true;
            if (xf || yf)
                return false;
        }
        return false;
    }
}
