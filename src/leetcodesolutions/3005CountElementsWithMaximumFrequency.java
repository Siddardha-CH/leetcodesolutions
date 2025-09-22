// You are given an array nums consisting of positive integers.

// Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

// The frequency of an element is the number of occurrences of that element in the array.

-----------------------------------------------------------

  class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> k = new ArrayList<>();
        int c = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                k.add(c);
                c = 1;
            }
            else {
                c += 1;
            }
        }
        k.add(c);
        c = 0;
        for (int i : k) {
            c = Math.max(c,i);
            System.out.println(i);
        }
        int ans= 0;
        for (int i: k) {
            if (i == c) {
                ans += 1;
            }
        }
        return ans * c ;
    } 
}
