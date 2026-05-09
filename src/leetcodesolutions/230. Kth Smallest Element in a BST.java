Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.




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
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-05-09                                             #
        #                                                                       #
        #########################################################################
        */
    ArrayList<Integer> k = new ArrayList<>();
    public int kthSmallest(TreeNode root, int p) {
        inorder(root, p);
        return k.get(p - 1);
    }

    public void inorder(TreeNode root, int p) {
        if (root == null)
            return ;
        inorder(root.left, p);
        k.add(root.val);
        inorder(root.right, p);
    }
}
