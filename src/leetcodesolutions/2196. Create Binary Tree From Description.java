You are given a 2D integer array descriptions where descriptions[i] = [parenti, childi, isLefti] indicates that parenti is the parent of childi in a binary tree of unique values. Furthermore,

If isLefti == 1, then childi is the left child of parenti.
If isLefti == 0, then childi is the right child of parenti.
Construct the binary tree described by descriptions and return its root.

The test cases will be generated such that the binary tree is valid.






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
        #  Date        : 2026-06-07                                             #
        #                                                                       #
        #########################################################################
        */
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> set = new HashSet<>(); // used dto find root of the tree

        for (int[] i : descriptions) {
            int p = i[0];
            int c = i[1];
            int l = i[2];

            if (!map.containsKey(p))
                map.put(p, new TreeNode(p));
            if (!map.containsKey(c))
                map.put(c, new TreeNode(c));
            
            TreeNode par = map.get(p);
            TreeNode ch = map.get(c);

            if (l == 1)
                par.left = ch;
            else
                par.right = ch;
            
            set.add(c);
        }

        for (int[] i : descriptions) 
            if (!set.contains(i[0]))
                return map.get(i[0]);
        
        return new TreeNode(0);
    }
}
