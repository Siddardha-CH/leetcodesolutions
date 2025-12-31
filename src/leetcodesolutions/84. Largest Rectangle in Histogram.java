// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, 
// return the area of the largest rectangle in the histogram.



________________________________________SOLUTION_____________________________________



  class Solution {
    public int largestRectangleArea(int[] h) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i <= h.length - 1; i++) {
            while (st.peek() != -1 && h[i] <= h[st.peek()]) {
                int k = h[st.pop()];
                ans = Math.max(ans,k * (i - st.peek() - 1));
            }
            st.push(i);
        }
        while (st.peek() != -1) {
            int k = h[st.pop()];
            ans = Math.max(ans,k * (h.length - st.peek() - 1));
        }
        return ans;
    }
}
