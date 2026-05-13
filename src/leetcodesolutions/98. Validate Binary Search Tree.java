Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys strictly less than the node's key.
The right subtree of a node contains only nodes with keys strictly greater than the node's key.
Both the left and right subtrees must also be binary search trees.





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
        #  Date        : 2026-05-13                                             #
        #                                                                       #
        #########################################################################
        */


        // SOLUTION - 1
    // List<Long> k = new ArrayList<>();
    // public boolean isValidBST(TreeNode root) {
    //     inorder(root);
    //     for (int i = 0; i < k.size() - 1; i++)
    //         if (k.get(i) >= k.get(i + 1))
    //             return false;
    //     return true;
    // }

    // public void inorder(TreeNode root) {
    //     if (root == null)
    //         return;
    //     inorder(root.left);
    //     k.add((long)root.val);
    //     inorder(root.right);
    // } 

    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE); 
    }

    public boolean dfs(TreeNode root, long min, long max) {
        if (root == null)
            return true;
        if (root.val <= min || root.val >= max)
            return false;
        
        return dfs(root.left , min, root.val) && dfs(root.right, root.val, max);
    }
}
