Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary 
representation of n. If there are no two adjacent 1's, return 0.

Two 1's are adjacent if there are only 0's separating them (possibly no 0's). The distance between two 1's
is the absolute difference between their bit positions. For example, the two 1's in "1001" have a distance of 3.




---------------------------------------SOLUTION-------------------------------------





  class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int ans = 0;
        int m = 0;
        int b = 0;
        for (char c : s.toCharArray()) 
            if (c == '1') {
                ans = Math.max(ans,m);
                m = 0;
                b += 1;
            } 
            else
                m += 1;
        if (b > 1)
            return ans + 1;
        return ans;
    }
}
