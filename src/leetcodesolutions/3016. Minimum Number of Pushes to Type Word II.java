You are given a string word containing lowercase English letters.

Telephone keypads have keys mapped with distinct collections of lowercase English letters, which can be used to form words by pushing them. For example, the key 2 is mapped with ["a","b","c"], we need to push the key one time to type "a", two times to type "b", and three times to type "c" .

It is allowed to remap the keys numbered 2 to 9 to distinct collections of letters. The keys can be remapped to any amount of letters, but each letter must be mapped to exactly one key. You need to find the minimum number of times the keys will be pushed to type the string word.

Return the minimum number of pushes needed to type word after remapping the keys.

An example mapping of letters to keys on a telephone keypad is given below. Note that 1, *, #, and 0 do not map to any letters.







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
        #  Date        : 2026-07-31                                             #
        #                                                                       #
        #########################################################################
        */
    public int minimumPushes(String s) {
        int[] freq = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a'] += 1;
        }
        int ans = 0;
        int cnt = 0;
        int press = 1;
        Arrays.sort(freq);
        for (int i = 25; i >= 0; i--) {
            if (freq[i] > 0) {
                ans = ans + (freq[i] * press);
                cnt += 1;
                if (cnt == 8) {
                    cnt = 0;
                    press += 1;
                }
            }
        }
        return ans;
    }
}
