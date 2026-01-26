// Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

// Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

// a, b are from arr
// a < b
// b - a equals to the minimum absolute difference of any two elements in arr



---------------------------------SOLUTION-------------------------------



  class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // Arrays.sort(arr);
        // Map<Integer,Integer> k = new HashMap<>();
        // for (int i = 1; i < arr.length; i++)
        //     k.put(Math.abs(arr[i] - arr[i - 1]),k.getOrDefault(Math.abs(arr[i] - arr[i - 1]), 0) + 1);
        // int max = Integer.MAX_VALUE;
        // int c = 0;
        // for (Map.Entry<Integer,Integer> e : k.entrySet()) 
        //     if (e.getKey() < max) {
        //         c = e.getValue();
        //         max = e.getKey();
        //     }
        // List<List<Integer>> ans = new ArrayList<>();
        // for (int i = 1; i < arr.length; i++)
        //     if (arr[i] - arr[i - 1] == max) 
        //         ans.add(Arrays.asList(arr[i - 1],arr[i]));
        // return ans;



      
        // -----------------------SOLUTION 2-------------------------------------

      

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++)
            min = Math.min(min, arr[i] - arr[ i  - 1]);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < arr.length; i++)
            if (arr[i] - arr[ i  - 1] == min)
                ans.add(Arrays.asList(arr[i - 1], arr[i]));
        return ans;
    }
}
