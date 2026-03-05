You are given a string s consisting only of the characters '0' and '1'. In one operation, you can change any '0' to '1' or vice versa.

The string is called alternating if no two adjacent characters are equal. For example, the string "010" is alternating, while the string "0100" is not.

Return the minimum number of operations needed to make s alternating.





-------------------------------------------------------SOLUTION--------------------------------------------------------------





class Solution {
    public int minOperations(String s) {
        // char[] c = s.toCharArray();
        // int ans = 0;
        // if (c.length == 1)
        //     return 0;
        // if (c.length == 2)
        //     if (c[0] == c[1])
        //         return 1;
        //     else
        //         return 0;
        // for (int i = 1; i < c.length - 1; i+= 1) 
        //     if (c[i - 1] == c[i] && c[i] == c[i + 1]) {
        //         if (c[i] == 1)
        //             c[i] = 0;
        //         else
        //             c[i] = 1;
        //         ans += 1;

        //     }
        //     else if (c[i - 1] == c[i] && c[i] != c[i + 1]) {
        //         c[i - 1] = c[i + 1];
        //         ans += 1;
        //     }
        //     else if (c[i - 1] != c[i] && c[i] == c[i + 1]) {
        //         c[i + 1] = c[i - 1];
        //         ans += 1;
        //     }
        // return ans;


        // _________________________________2_________________________________

        // String s1 = "";
        // String s2 = "";
        // for (int i = 0; i < s.length(); i++) 
        //     if (i % 2 == 0) {
        //         s1 += '1';
        //         s2 += '0';
        //     }
        //     else {
        //         s2 += '1';
        //         s1 += '0';
        //     }
        // int m1 = 0;
        // int m2 = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     if (s1.charAt(i) != s.charAt(i))
        //         m1 += 1;
        //     if (s2.charAt(i) != s.charAt(i))
        //         m2 += 1;
        // }
        // return Math.min(m1,m2);


        // ___________________________________3_____________________________________




        int m1 = 0;
        int m2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) 
                if (c == '1')
                    m1 += 1;
                else
                    m2 += 1;
            else
                if (c == '1')
                    m2 += 1;
                else
                    m1 += 1;
        }
        return Math.min(m1,m2);
   }
}
