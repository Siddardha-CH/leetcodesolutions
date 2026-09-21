You are given an array of CPU tasks, each labeled with a letter from A to Z, and a number n. Each CPU interval can be idle or allow the completion of one task. Tasks can be completed in any order, but there's a constraint: there has to be a gap of at least n intervals between two tasks with the same label.

Return the minimum number of CPU intervals required to complete all tasks.






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
        #  Date        : 2026-21-08                                             #
        #                                                                       #
        #########################################################################
        */
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char c : tasks)
            freq[c - 'A'] += 1;
        Arrays.sort(freq);
        int max = freq[25];
        int maxidle = (max - 1) * n;
        for (int i = 0; i < 25; i++)
            maxidle -= Math.min(max - 1, freq[i]);
        int ans = Math.max(0, maxidle) + tasks.length;
        return ans;
    }
}
