// Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

// Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

// Return any answer array that satisfies this condition.


class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int e = 0;
        int o = 1;
        while(e < nums.length && o < nums.length) {
            if (nums[e] % 2 == 0)
            e+=2;
            else if (nums[o] %2 != 0)
            o+=2;
            else {
                int temp = nums[e];
                nums[e] = nums[o];
                nums[o] = temp;
                o+=2;
                e+=2;
            }

        }
        return nums;

        
    }
}
