You are given two 0-indexed integer permutations A and B of length n.

A prefix common array of A and B is an array C such that C[i] is equal to the count of numbers that are present at or before the index i in both A and B.

Return the prefix common array of A and B.

A sequence of n integers is called a permutation if it contains all integers from 1 to n exactly once.







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
        #  Date        : 2026-05-20                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        int n = A.length;
        int[] ans = new int[n];

        int c = 0;
        
        for (int i = 0; i < n; i++) {
            if (a.contains(A[i]) && b.contains(B[i])) {
                c += 2;
                
            }   
            else if (A[i] == B[i] || a.contains(A[i]) || b.contains(B[i])){
                c += 1;
            }
            ans[i] = c;
            a.add(B[i]);
            b.add(A[i]);
        }
        return ans;
    }
}
