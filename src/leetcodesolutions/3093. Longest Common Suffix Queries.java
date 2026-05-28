You are given two arrays of strings wordsContainer and wordsQuery.

For each wordsQuery[i], you need to find a string from wordsContainer that has the longest common suffix with wordsQuery[i]. If there are two or more strings in wordsContainer that share the longest common suffix, find the string that is the smallest in length. If there are two or more such strings that have the same smallest length, find the one that occurred earlier in wordsContainer.

Return an array of integers ans, where ans[i] is the index of the string in wordsContainer that has the longest common suffix with wordsQuery[i].




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
        #  Date        : 2026-05-28                                             #
        #                                                                       #
        #########################################################################
        */
    static class TrieNode {
        int idx;
        TrieNode[] children;

        TrieNode() {
            idx = -1;
            children = new TrieNode[26];

        }
    }

    public TrieNode getNode(int idx) {
        TrieNode t = new TrieNode();
        t.idx = idx;
        return t;
    }

    public void insert(TrieNode p, int i, String[] s) {
        String word = s[i];
        int n = word.length();

        for (int j = n -1; j >= 0; j--) {
            int cin = word.charAt(j) - 'a';

            if (p.children[cin] == null)
                p.children[cin] = getNode(i);
            
            p = p.children[cin];

            if (s[p.idx].length() > n)
                p.idx = i;
        }
    }

    public int search(TrieNode p, String s) {
        int r = p.idx;
        int n = s.length();

        for (int j = n - 1; j >= 0; j--) {
            int cin = s.charAt(j) - 'a';
            if (p.children[cin] == null)
                return r;
            p = p.children[cin];
            r = p.idx;
        } 
        return r;
    }
    public int[] stringIndices(String[] wc, String[] wq) {
        int l1 = wc.length;
        int l2 = wq.length;
        int[] ans = new int[l2];

        TrieNode root = getNode(0);

        for (int i = 0; i < l1; i++) {
            if (wc[root.idx].length() > wc[i].length())
                root.idx = i;
            insert(root, i, wc);
        }

        for (int i = 0; i < l2; i++)
            ans[i] = search(root, wq[i]);

        return ans;
    }
}
