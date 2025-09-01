// Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

-------------------------------------------


  class Solution {
    public int hammingWeight(int n) {
        ArrayList<Integer> bits = new ArrayList<>();
        while (n > 0) {
            bits.add(n % 2);
            n /= 2;
        }
        int ans = 0;
        for (int i  =0; i < bits.size(); i++) {
            if (bits.get(i) == 1) {
                ans += 1;
            }
        }
        return ans;
    }
}
