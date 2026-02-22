You are given an integer array nums, where nums[i] represents the points scored in the ith game.

There are exactly two players. Initially, the first player is active and the second player is inactive.

The following rules apply sequentially for each game i:

If nums[i] is odd, the active and inactive players swap roles.
In every 6th game (that is, game indices 5, 11, 17, ...), the active and inactive players swap roles.
The active player plays the ith game and gains nums[i] points.
Return the score difference, defined as the first player's total score minus the second player's total score.





  ---------------------------------------------SOLUTION---------------------------------------------




  class Solution {
    public int scoreDifference(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        boolean b = true;
        for (int i = 0; i < nums.length; i++) {
            if (i % 6 == 5 && nums[i] % 2 == 1)
                b = b;
            else if (i % 6 == 5 || nums[i] % 2 == 1) {
                if (b == true)
                    b = false;
                else
                    b = true;
            }
            if (b == true)
                p1 += nums[i];
            else
                p2 += nums[i];
        }
        return p1 - p2;
    }
}
