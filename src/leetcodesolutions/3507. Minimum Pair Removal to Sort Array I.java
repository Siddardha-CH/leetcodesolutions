// Given an array nums, you can perform the following operation any number of times:

// Select the adjacent pair with the minimum sum in nums. If multiple such pairs exist, choose the leftmost one.
// Replace the pair with their sum.
// Return the minimum number of operations needed to make the array non-decreasing.

// An array is said to be non-decreasing if each element is greater than or equal to its previous element (if it exists).



--------------------------------------SOLUTION---------------------------------------



  class Solution {
    public int minimumPairRemoval(int[] nums) {
        int ans = 0;
        ArrayList<Integer> k = new ArrayList<>();
        for (int i : nums)
            k.add(i);
        while (!sorted(k)) {
            int min = Integer.MAX_VALUE;
            int i = 0;
            ans += 1;
            for (int j = 1; j < k.size(); j++) {
                int s = k.get(j) + k.get(j - 1);
                if (s < min) {
                    min = s;
                    i = j - 1;
                }
            }
            k.set(i,min);
            k.remove(i + 1);
        }
        return ans;
    }
    public boolean sorted(ArrayList<Integer> k) {
        for (int i = 1; i < k.size(); i++) 
            if (k.get(i) < k.get(i - 1))
                return false;
        return true;
    }
}
