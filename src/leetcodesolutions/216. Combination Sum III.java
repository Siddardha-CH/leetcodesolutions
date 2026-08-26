Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

Only numbers 1 through 9 are used.
Each number is used at most once.
Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.





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
        #  Date        : 2026-08-26                                             #
        #                                                                       #
        #########################################################################
        */
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        if (k * 9 < n || k > n)
            return ans;
        ArrayList<Integer> p = new ArrayList<>();
        func(1, k, n, ans, p);
        return ans;
    }
    public void func(int i, int k, int n, List<List<Integer>> ans, ArrayList<Integer> p) {
        if (k == 0 && n == 0) {
            ans.add(new ArrayList<>(p));
            return;
        }
        for (int j = i; j < 10; j++) {
            if (j > n)
                break;
            p.add(j);
            func(j + 1, k - 1, n - j, ans, p);
            p.remove(p.size() - 1);
        }
        
    }
}
