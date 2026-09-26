You are given a string s that contains some bracket pairs, with each pair containing a non-empty key.

For example, in the string "(name)is(age)yearsold", there are two bracket pairs that contain the keys "name" and "age".
You know the values of a wide range of keys. This is represented by a 2D string array knowledge where each knowledge[i] = [keyi, valuei] indicates that key keyi has a value of valuei.

You are tasked to evaluate all of the bracket pairs. When you evaluate a bracket pair that contains some key keyi, you will:

Replace keyi and the bracket pair with the key's corresponding valuei.
If you do not know the value of the key, you will replace keyi and the bracket pair with a question mark "?" (without the quotation marks).
Each key will appear at most once in your knowledge. There will not be any nested brackets in s.

Return the resulting string after evaluating all of the bracket pairs.





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
        #  Date        : 2026-26-08                                             #
        #                                                                       #
        #########################################################################
        */
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> l : knowledge)
            map.put(l.get(0), l.get(1));
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        boolean k = false;
        for (char c : s.toCharArray()) {
            if (c == '(')
                k = true;
            else if (c == ')') {
                k = false;
                if (!map.containsKey(sb.toString()))
                    ans.append('?');
                else
                    ans.append(map.get(sb.toString()));
                sb = new StringBuilder();
            }
            else if (k == false)
                ans.append(c);
            else
                sb.append(c);
        }
        return ans.toString();
    }
}
