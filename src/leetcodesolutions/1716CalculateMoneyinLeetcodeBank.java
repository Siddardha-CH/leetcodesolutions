// Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.

// He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put 
// in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.

// Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.


---------------------------------------------SOLUTION-------------------------------------------------


  class Solution {
    public int totalMoney(int n) {
        int ans = 0;
        int a = 1;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 1) {
                b = a;
                a += 1;
            }
            ans += b;
            b += 1;
        }
        return ans;
    }
}
