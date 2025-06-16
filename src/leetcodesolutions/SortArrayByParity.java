// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

// Return any array that satisfies this condition.

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        if (nums.length == 1 )
        return nums;
        while (l < r){
            if (nums[l] % 2 == 1 && nums[r] %2 ==0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
            if (nums[r] % 2==1) 
                r--;
            if (nums[l] % 2 == 0)
                l++;
            }
        return nums;
        
    }
}
