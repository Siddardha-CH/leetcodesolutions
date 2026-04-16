You are given a circular array nums and an array queries.

For each query i, you have to find the following:

The minimum distance between the element at index queries[i] and any other index j in the circular array, where nums[j] == nums[queries[i]]. If no such index exists, the answer for that query should be -1.
Return an array answer of the same size as queries, where answer[i] represents the result for query i.





class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-16                                             #
        #                                                                       #
        #########################################################################
        */



        List<Integer> ans = new ArrayList<>();
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.get(nums[i]).add(i);
            else {
                ArrayList<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(nums[i], l);
            }
        }
        
        for (int i : queries) {
            int n = nums[i];
            ArrayList<Integer> list = map.get(n);
            if(list.size() > 1) {

            // GOT TLE
            
            // for (Integer j : l)
            //     if (j != i)             
            //         s = Math.min(s, Math.min(Math.abs(j - i), nums.length - Math.abs(j - i)));
            // ans.add(s);

                int l = 0;
                int r = list.size() - 1;
                while (r >= l) {            // Binary Search to find the index in sorted list
                    int m = (l + r) / 2;
                    if (list.get(m) == i) {
                        l = m;
                        break;
                    }
                    else if (list.get(m) > i) 
                        r = m - 1;
                    else
                        l = m + 1;
                }
                // NOW DISTNACE 
                int s = 999999;

                // left neighbor
                
                int j = list.get((l - 1 + list.size()) % list.size());
                s = Math.min(s, Math.min(Math.abs(j - i), nums.length - Math.abs(j - i)));
                

                // right neighbor
                
                j = list.get((l + 1) % list.size());
                s = Math.min(s, Math.min(Math.abs(j - i), nums.length - Math.abs(j - i)));
                
                ans.add(s);
            }
            else
                ans.add(-1);
        }
        return ans;
    } 
}

