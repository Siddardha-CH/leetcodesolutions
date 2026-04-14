Given the root of a binary tree, invert the tree, and return its root.



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
    public TreeNode invertTree(TreeNode root) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-14                                             #
        #                                                                       #
        #########################################################################
        */

        if (root == null)   
            return null;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            TreeNode c = q.poll();   // removes head and also handles expection by returning nul when empty

            TreeNode t = c.left;
            c.left = c.right;
            c.right = t;

            if (c.left != null)
                q.add(c.left);
            if (c.right != null)    
                q.add(c.right);
        }
        return root;
    }
}
