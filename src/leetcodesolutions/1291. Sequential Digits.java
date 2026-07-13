An integer has sequential digits if and only if each digit in the number is one more than the previous digit.

Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.






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
        #  Date        : 2026-07-13                                             #
        #                                                                       #
        #########################################################################
        */
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> k = new ArrayList<>();
        for (char c = '1'; c <= '9'; c++) {
            String s = "" + c;
            for (char d = (char)(c + 1) ;d <= '9'; d++) {
                s += d;
                k.add(Integer.parseInt(s));
            }
            s = "";
        }
        List<Integer> ans = new ArrayList<>();
        for (int i : k)
            if (i >= low && i <= high)
                ans.add(i);
        Collections.sort(ans);
        return ans;
    }
}
