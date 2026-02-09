Given the root of a binary search tree, return a balanced binary search tree with the same node values. If there is more than one answer, return any of them.

A binary search tree is balanced if the depth of the two subtrees of every node never differs by more than 1.






  ---------------------------------------------SOLUTION--------------------------------------------------





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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> k = new ArrayList<>();
        inorder(root,k);
        return bal(k, 0, k.size() - 1);
    }
    public void inorder(TreeNode root, ArrayList<Integer> k) {
        if (root == null)
            return;
        inorder(root.left,k);
        k.add(root.val);
        inorder(root.right,k);
    }
    public TreeNode bal(ArrayList<Integer> k, int l ,int  r) {
        if (l > r)
            return null;
        int m = (l + r) / 2;
        TreeNode t = new TreeNode(k.get(m));
        t.left = bal(k, l, m - 1);
        t.right = bal(k, m + 1, r);
        return t;
    }
}
