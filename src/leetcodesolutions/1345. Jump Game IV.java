Given an array of integers arr, you are initially positioned at the first index of the array.

In one step you can jump from index i to index:

i + 1 where: i + 1 < arr.length.
i - 1 where: i - 1 >= 0.
j where: arr[i] == arr[j] and i != j.
Return the minimum number of steps to reach the last index of the array.

Notice that you can not jump outside of the array at any time.







  class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-05-18                                             #
        #                                                                       #
        #########################################################################
        */
    public int minJumps(int[] arr) {
        int ans = 0;
        int n = arr.length;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) 
            if (map.containsKey(arr[i]))
                map.get(arr[i]).add(i);
            else {
                ArrayList<Integer> k = new ArrayList<>();
                k.add(i);
                map.put(arr[i], k);
            }
        boolean[] k = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        k[0] = true;
        while(! q.isEmpty()) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                int idx = q.poll();
                if (idx == n -1)
                    return ans;
                if (idx -  1 >= 0 && !k[idx - 1]) {
                    k[idx - 1] = true;
                    q.add(idx - 1);
                }
                if (idx + 1 < n && !k[idx + 1]) {
                    k[idx + 1] = true;
                    q.add(idx + 1);
                }
                if (map.containsKey(arr[idx])) {
                    for (int m : map.get(arr[idx])) 
                        if (!k[m]) {
                            k[m] = true;
                            q.add(m);
                         }    
                    map.remove(arr[idx]);
                }     
            }
            ans += 1;
        } 
        return ans;
    }
}
 
