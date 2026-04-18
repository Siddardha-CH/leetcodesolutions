You are given an integer array nums of length n.

Construct an array prefixGcd where for each index i:

Let mxi = max(nums[0], nums[1], ..., nums[i]).
prefixGcd[i] = gcd(nums[i], mxi).
After constructing prefixGcd:

Sort prefixGcd in non-decreasing order.
Form pairs by taking the smallest unpaired element and the largest unpaired element.
Repeat this process until no more pairs can be formed.
For each formed pair, compute the gcd of the two elements.
If n is odd, the middle element in the prefixGcd array remains unpaired and should be ignored.
Return an integer denoting the sum of the GCD values of all formed pairs.

The term gcd(a, b) denotes the greatest common divisor of a and b.




class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-18                                             #
        #                                                                       #
        #########################################################################
        */
    public long gcd(long a, long b) { // FUNC TO COMPUTE GCD OPTIMALLY
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public long gcdSum(int[] nums) {
        long max = -1;
        long[] pre = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max((long)nums[i], max);
            pre[i] = gcd((long)nums[i], max);
        }

        Arrays.sort(pre);
        // for (long i : pre)
        //     System.out.println(i);
        int l = 0;
        int r = nums.length - 1;
        long ans = 0;

        while (r > l) 
            ans += gcd(pre[l++], pre[r--]);
        
        return ans;
    }
}
