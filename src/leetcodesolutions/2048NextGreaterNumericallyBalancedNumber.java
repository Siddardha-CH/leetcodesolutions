// An integer x is numerically balanced if for every digit d in the number x, there are exactly d occurrences of that digit in x.

// Given an integer n, return the smallest numerically balanced number strictly greater than n.


-----------------------SOLUTION-------------------------------


  class Solution {
    public int nextBeautifulNumber(int n) {
        for (int  i = n + 1; i < 1224445; i++) {
            if (validate(i)) {
                return i;
            }
        }
        return 0;
    }
    boolean validate(int k) {
        // Map<Integer,Integer> map = new HashMap<>();
        // while (k > 0) {
        //     int n = k % 10;
        //     k /= 10;
        //     map.put(n,map.getOrDefault(n,0) + 1);
        // }
        // for (Map.Entry<Integer,Integer> e : map.entrySet()) {
        //     if (e.getKey() != e.getValue()) {
        //         return false;
        //     }
        // }
        int[] arr = new int[10];
        while(k > 0) {
            int n = k % 10;
            arr[n] += 1;
            k /= 10;
        }
        for (int i = 0; i < 10; i ++) {
            if (arr[i] > 0 && arr[i] != i) {
                return false;
            }
        }
        return true;
    }
}
