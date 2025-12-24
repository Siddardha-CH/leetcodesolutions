// You are given an array apple of size n and an array capacity of size m.

// There are n packs where the ith pack contains apple[i] apples. There are m boxes as well, and the ith box has a capacity of capacity[i] apples.

// Return the minimum number of boxes you need to select to redistribute these n packs of apples into boxes.

// Note that, apples from the same pack can be distributed into different boxes.




____________________________________________SOLUTION____________________________________________





  class Solution {
    public int minimumBoxes(int[] apple, int[] cap) {
        Arrays.sort(cap);
        int c = 0;
        for (int i : apple)
            c += i;
        int ans = 0;
        int k = 0;
        for (int i = cap.length - 1; i >= 0; i--) {
            k += cap[i];
            ans += 1;
            if (k >= c) 
                return ans;
        }
        return ans;
    }
}
