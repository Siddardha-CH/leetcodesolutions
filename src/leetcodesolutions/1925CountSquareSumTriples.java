//  square triple (a,b,c) is a triple where a, b, and c are integers and a2 + b2 = c2.

// Given an integer n, return the number of square triples such that 1 <= a, b, c <= n.



__________________________________SOLUTION______________________________________



  class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for (int i = 1; i < n - 1; i++)
            for (int j = i + 1;j < n ; j++) {
                int hyp = (int) Math.sqrt((i * i) + (j * j));
                if ((hyp * hyp == (i * i) + (j * j)) && hyp <= n)
                    ans += 2;
            }
        return ans;
    }
}
