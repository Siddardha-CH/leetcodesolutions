// Given an integer array nums, return the number of subarrays filled with 0.

// A subarray is a contiguous non-empty sequence of elements within an array.

------------------------------------------------------------------------------


  class Solution {
    public long zeroFilledSubarray(int[] nums) {
        // List<Long> arr = new ArrayList<>();
        // long a = 0;
        // for (int i : nums) {
        //     if (i == 0) {
        //         a += 1;
        //     }
        //     else {
        //         arr.add(a);
        //         a = 0;
        //     }
        // }
        // if (a > 0) {
        //     arr.add(a);
        // }
        // long ans = 0;
        // for (long i : arr) {
        //     ans += ((i * (i + 1)) / 2);
        // }
        // return ans;


        long a= 0;
        long ans = 0;
        for (int i : nums) {
            if (i == 0) {
                a += 1;
            }
            else {
                ans += ((a * (a + 1)) / 2);
                a = 0; 
            }
        }
        if (a > 0) {
            ans += ((a * (a + 1)) / 2);
        }
        return ans;
    }
}
