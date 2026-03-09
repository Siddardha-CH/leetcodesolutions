Given an array of strings nums containing n unique binary strings each of length n, return a binary 
string of length n that does not appear in nums. If there are multiple answers, you may return any of them.




---------------------------------SOLUTION--------------------------------




class Solution {
    public String findDifferentBinaryString(String[] nums) {
        // Set<String> k = new HashSet<>();
        // for (String s : nums)
        //     k.add(s);
        // int n = 2 << nums.length - 1;
        // for (int i = 0; i < n; i++) {
        //     String s = Integer.toBinaryString(i);
        //     while (s.length() != nums.length) {
        //         s = '0' + s;
        //     }
        //     if (!k.contains(s))
        //         return s;
        // }
        // return "";




        // ----------------------OPTIMAL------------------------
        String s = "";
        int i = 0;
        for (String k : nums) {
            if (k.charAt(i) == '1')
                s += '0';
            else
                s += '1';
            i += 1;
        }
        return s;
    }
}
