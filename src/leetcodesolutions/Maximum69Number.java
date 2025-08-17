// You are given a positive integer num consisting only of digits 6 and 9.

// Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6)

__________________________________________________________


  class Solution {
    public int maximum69Number (int num) {
        String c = num + "";
        int l = 0;
        int r = c.length() - 1;
        char arr[] = new char[r + 1];
        int k = 0;
        for ( int  i = 0; i < arr.length; i++) {
            arr[i] = c.charAt(i);
            if (k == 0 && arr[i] == '6') {
                arr[i] = '9';
                k = 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i ++ ) {
            int n = arr[i] - '0';
            ans += n;
            if (i != arr.length - 1) {
                ans = ans * 10;
            }
        }
        return ans;

    }
}
