Given the binary representation of an integer as a string s, return the number of steps to reduce it to 1 under the following rules:

If the current number is even, you have to divide it by 2.

If the current number is odd, you have to add 1 to it.

It is guaranteed that you can always reach one for all test cases.





---------------------------------------SOLUTION---------------------------------------





  class Solution {
    public int numSteps(String s) {
        // int n = Integer.parseInt(s, 2);
        // int ans = 0;
        // while (n != 1) 
        //     if (n % 2 == 1) {
        //         ans += 1;
        //         n += 1;
        //     }
        //     else {
        //         ans += 1;
        //         n /= 2;
        //     }
        // return ans;
        int ans = 0;
        int carry = 0;
        for (int i = s.length() - 1; i >= 1; i--) {
            if (s.charAt(i) == '0' && carry == 0)
                ans += 1;
            else if (s.charAt(i) == '1' && carry == 1) {
                ans += 1;
                carry = 1;
            }
            else {
                carry = 1;
                ans += 2;
            }
        }
        if (carry == 1)
            ans += 1;
        return ans;
    }
}
