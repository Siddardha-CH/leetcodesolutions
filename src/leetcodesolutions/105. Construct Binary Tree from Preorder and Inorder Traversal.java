Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.




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
        #  Date        : 2026-14-08                                             #
        #                                                                       #
        #########################################################################
        */
    Map<Integer, Integer> map = new HashMap<>();
    int idx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        for (int i = 0; i < n; i++)
            map.put(inorder[i], i);
        TreeNode ans = dfs(preorder, 0, n- 1);
        return ans;
    }
    public TreeNode dfs(int[] preorder, int l, int r) {
        if (l > r) 
            return null;
        int val = preorder[idx];
        idx += 1;
        TreeNode node = new TreeNode(val);
        int m = map.get(val);
        node.left = dfs(preorder, l, m - 1);
        node.right = dfs(preorder, m + 1, r);
        return node;
    }
}
