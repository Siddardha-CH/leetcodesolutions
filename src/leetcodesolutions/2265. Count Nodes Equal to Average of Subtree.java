Given the root of a binary tree, return the number of nodes where the value of the node is equal to the average of the values in its subtree.

Note:

The average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.
A subtree of root is a tree consisting of root and all of its descendants.






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
        #  Date        : 2026-10-08                                             #
        #                                                                       #
        #########################################################################
        */
    int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        func(root);
        return ans;
    }
    public int[] func(TreeNode root) {
        if (root == null)
            return new int[] {0, 0};
        int[] l = func(root.left);
        int[] r = func(root.right);
        int sum = l[0] + r[0] + root.val;
        int cnt = l[1] + r[1] + 1;
        if (sum / cnt == root.val)
            ans += 1;
        return new int[] {sum, cnt};
    }
}
