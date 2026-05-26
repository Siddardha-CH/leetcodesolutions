You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.

Return the number of special letters in word.




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
        #  Date        : 2026-05-26                                             #
        #                                                                       #
        #########################################################################
        */
    public int numberOfSpecialChars(String word) {
        // Set<Character> set = new HashSet<>();
        // int[] v = new int[26];
        // int ans = 0;
        // for (char c : word.toCharArray()) {
        //     if (c >= 'A' && c <= 'Z') {
        //         char k = (char) (c + 32);
        //         if (v[k - 'a'] == 0 && set.contains(k)) {
        //             ans += 1;
        //             set.remove(k);
        //             v[k - 'a'] = 1;
        //         }
        //         else
        //             set.add(c);
        //     }
        //     else {
        //         char k = (char) (c - 32);
        //         if (v[c - 'a'] == 0 && set.contains(k)) {
        //             ans += 1;
        //             set.remove(k);
        //             v[c - 'a'] = 1;
        //         }
        //         else
        //             set.add(c);
        //     }
        // }
        // return ans;




        boolean[] l = new boolean[26];
        boolean[] u = new boolean[26];

        int ans = 0;

        for (char c : word.toCharArray())
            if (c >= 'A' && c <= 'Z')
                u[c - 'A'] = true;
            else
                l[c - 'a'] = true;
        
        for (int i = 0; i < 26; i++)
            if (l[i] && u[i])
                ans += 1;
        
        return ans;
    }
}
