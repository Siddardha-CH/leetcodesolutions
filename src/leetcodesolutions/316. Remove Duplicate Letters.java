Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.






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
        #  Date        : 2026-07-19                                             #
        #                                                                       #
        #########################################################################
        */
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int[] last = new int[26];
        int[] used = new int[26];
        for (int i = 0; i < n; i++)
            last[s.charAt(i) - 'a'] = i;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            if (used[idx]  == 1)
                continue;
            while (!stack.isEmpty() && c < stack.peek() && last[stack.peek() - 'a'] > i) {
                int k = stack.pop() - 'a';
                used[k] = 0;
            }
            stack.push(c);
            used[idx] = 1;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        
        return sb.reverse().toString();
    }
}
