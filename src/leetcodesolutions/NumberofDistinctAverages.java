// You are given a 0-indexed integer array nums of even length.

// As long as nums is not empty, you must repetitively:

// Find the minimum number in nums and remove it.
// Find the maximum number in nums and remove it.
// Calculate the average of the two removed numbers.
// The average of two numbers a and b is (a + b) / 2.

// For example, the average of 2 and 3 is (2 + 3) / 2 = 2.5.
// Return the number of distinct averages calculated using the above process.

// Note that when there is a tie for a minimum or maximum number, any can be removed.


class Solution {
    public int distinctAverages(int[] nums) {
        double[] ans = new double[nums.length /2];
        int n = nums.length;
        int z = 0;
        while (n > 1) {
            double max = -11111;
            double min = 99999;
            int minid = 0;
            int maxid = 0;
            for (int i = 0; i<nums.length; i++) {
                if (nums[i] > -1) {
                   if (nums[i] > max) {
                        max = nums[i];
                        maxid = i;
                    }
                    if (nums[i] < min) {
                        min = nums[i];
                        minid = i;
                    }
                }
            }
            nums[minid] = -1;
            nums[maxid] = -1;
            n = n-2;
            ans[z] = (max+min)/2;
            z++;
        }
        for (int i = 0; i < ans.length-1; i++) {
            System.out.println(ans[i]);}
        Arrays.sort(ans);
        int dis = 1;
        for (int i = 0; i < ans.length-1; i++) {
            if (ans[i] != ans[i+1])
            dis++;
        }
        return dis;
        
    }
}                        
                                                          (OR)


                                                               class Solution {
                                                                  public int distinctAverages(int[] nums) {
                                                                    Arrays.sort(nums);
                                                                    double[] ans = new double[nums.length/2];
                                                                    int l = 0;
                                                                    int r = nums.length-1;
                                                                    int a = 0;
                                                                    while (l < r) {
                                                                        System.out.println(nums[l] + " and" + nums[r]);
                                                                        double b = (nums[l] + nums[r]) / 2.0;
                                                                        ans[a++] = b;
                                                                        l++;
                                                                        r--;
                                                                    }
                                                                    int dis = 1;
                                                                    Arrays.sort(ans);
                                                                    for (int i = 0; i < ans.length-1; i++) {
                                                                        System.out.println(ans[i]);
                                                                        if  (ans[i] != ans[i+1]) {
                                                                            dis++;
                                                                        }
                                                                    }
                                                                    
                                                                    return dis;
                                                                }
                                                            }











                                                          
