// You are given a 0-indexed integer array nums. An index i is part of a hill in nums if the closest non-equal neighbors of
//   i are smaller than nums[i]. Similarly, an index i is part of a valley in nums if the closest non-equal neighbors of i are 
//   larger than nums[i]. Adjacent indices i and j are part of the same hill or valley if nums[i] == nums[j].

// Note that for an index to be part of a hill or valley, it must have a non-equal neighbor on both the left and right of the index.

// Return the number of hills and valleys in nums.

__________________________________________________________________________________________________________________________




  class Solution {
    public int countHillValley(int[] nums) {
        int[] counter= new int[nums.length];
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            counter[i] = 0;
        }
        for(int i = 1; i < nums.length - 1; i++) {
            
            if (nums[i] == nums[i - 1]) continue;// TO SKIP MULTIPLE DUPLICATES
            int a = 101;
            int b = 101;
            if (nums[i] == nums[i - 1]){
                for (int j = i-2 ; j >= 0; j--) {
                    if (nums[j] != nums[i]) {
                        a = nums[j];
                        break;
                    }
                }
            }
            else{
                a = nums[i - 1];
            }
            if (nums[i] == nums[i + 1]){
                for (int j = i + 2 ; j <nums.length; j++) {
                    if (nums[j] != nums[i]) {
                        b = nums[j];
                        break;
                    }
                }
            }
            else{
                b = nums[i + 1];

            }
            if (a != 101 && b!= 101) {
            if (nums[i]> a && nums[i] > b ){
                counter [c] = 1;
                c++;
            }
            if (nums[i]< a && nums[i] < b ){
                counter [c] = -1;
                c++;
            }
            }
        }
        int ans = 0;
        for (int i = 0; i < c; i++) {
            
            if (counter[i] != 0 ){
                ans += 1;
            }
        } 
        return ans ;
    }
}
