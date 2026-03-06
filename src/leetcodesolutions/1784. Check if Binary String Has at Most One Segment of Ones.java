Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.



-------------------------------------SOLUTION-------------------------------------




class Solution {
    public boolean checkOnesSegment(String s) {
        if (s.contains("01"))
            return false;
        return true;
    }
}
