// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.


__________________________________________SOLUTION_______________________________________________



  class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int c1 = 0;
        int c2 = 0;
        Integer k1 = null;
        Integer k2 = null;
        for (int i : nums) {
            if (k1 != null && i == k1)
                c1 += 1;
            else if(k2 != null && i == k2)
                c2 += 1;
            else if (c1 == 0) {
                c1 += 1;
                k1 = i;
            }
            else if (c2 == 0) {
                c2 += 1;
                k2 = i;
            }
            else {
                c1 -= 1;
                c2 -= 1;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int i : nums) {
            if (k1 != null && i == k1)
                c1 += 1;
            if (k2 != null && i == k2)
                c2 += 1;
        }
        if (k1 != null && c1 > nums.length / 3)
            ans.add(k1);
        if (k2 != null && c2 > nums.length / 3)
            ans.add(k2);
        return ans;
    }
}
