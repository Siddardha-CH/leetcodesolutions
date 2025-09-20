// Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

// You must solve the problem without using any built-in library for handling large integers (such as BigInteger). 
// You must also not convert the inputs to integers directly.

-----------------------------------------------------------------


  class Solution {
    public String addStrings(String num1, String num2) {
        // int p = Integer.parseInt(num1);
        // int q = Integer.parseInt(num2);
        // return "" + (p + q);
        String ans = "";
        int a = num1.length() - 1;
        int b = num2.length() - 1;
        boolean j = false;
        String x;
        int g;
        int k;
        while (a > -1 || b > -1) {
            if (a > -1 && b > -1) {
                int q = num1.charAt(a) - '0';
                int w = num2.charAt(b) - '0';
                if (j == true) {
                    g = q + w + 1;
                    x = "" + g;
                    if (x.length() > 1) {
                        ans += x.charAt(1);
                        j = true;
                    } else {
                        ans += x;
                        j = false;
                    }
                } else {
                    g = q + w;
                    x = "" + g;
                    if (x.length() > 1) {
                        ans += x.charAt(1);
                        j = true;
                    } else {
                        ans += x;
                        j = false;
                    }
                }
                a--;
                b--;
            } else {
                if (a > -1) {
                    k = num1.charAt(a) - '0';
                    if (j == true) {
                        x = "" + (k + 1);
                        j = false;
                    } else {
                        x = "" + k;
                    }
                    if (x.length() > 1) {
                        j = true;
                        ans += x.charAt(1);
                    } else {
                        ans += x;
                    }
                    a--;
                } else {
                    k = num2.charAt(b) - '0';
                    if (j == true) {
                        x = "" + (k + 1);
                        j = false;
                    } else {
                        x = "" + k;
                    }
                    if (x.length() > 1) {
                        j = true;
                        ans += x.charAt(1);
                    } else {
                        ans += x;
                    }
                    b--;
                }
            }
        }
        if (j == true) {
            ans += '1';
        }
        String answer = "";
        for (int i = ans.length() - 1; i >= 0; i--) {
            answer += ans.charAt(i);
        }
        return answer;
    }

}
