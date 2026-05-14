Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.

Clarification: The input/output format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.






/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-05-14                                             #
        #                                                                       #
        #########################################################################
        */

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        ArrayList<String> k = new ArrayList<>();    
        preorder(root, k);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < k.size(); i++) {
            ans.append(k.get(i));
            if (i != k.size() - 1)
                ans.append(",");
        }
        return ans.toString();
    }
    public void preorder(TreeNode root, ArrayList<String> k) {
        if (root == null) {
            k.add("null");
            return;
        }
        String s = String.valueOf(root.val);
        k.add(s);
        preorder(root.left, k);
        preorder(root.right, k);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String s) {
        ArrayList<String> k = new ArrayList<>();
        String d = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',') {
                k.add(d);
                d = "";
            }
            else
                d += s.charAt(i);
        }
        k.add(d);

        return buildTree(k);
    }
    int idx = 0;
    public TreeNode buildTree(ArrayList<String> k) {
        if (k.get(idx).equals("null")) {
            idx += 1;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(k.get(idx)));
        idx += 1;
        root.left = buildTree(k);
        root.right = buildTree(k);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
