Given two binary strings a and b, return their sum as a binary string.




  ------------------------------------------SOLUTION-------------------------------------




  class Solution {
    public String addBinary(String a, String b) {
        int k = Math.max(a.length(), b.length());
        String ans = "";
        int c = 0;

        for (int i = 0; i < k; i++) {

            char ca = (a.length() - 1 - i >= 0) ? a.charAt(a.length() - 1 - i) : '0';
            char cb = (b.length() - 1 - i >= 0) ? b.charAt(b.length() - 1 - i) : '0';

            if (ca == '0' && cb == '0') {
                if (c == 1) {
                    c = 0;
                    ans = '1' + ans;
                } else
                    ans = '0' + ans;
            } 
            else if ((ca == '1' && cb == '0') || (ca == '0' && cb == '1')) {
                if (c == 1) {
                    c = 1;
                    ans = '0' + ans;
                } else
                    ans = '1' + ans;
            } 
            else {
                if (c == 1)
                    ans = '1' + ans;
                else {
                    ans = '0' + ans;
                    c = 1;
                }
            }
        }

        if (c == 1)
            ans = '1' + ans;

        return ans;
    }
}
