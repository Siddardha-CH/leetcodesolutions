You are maintaining a project that has n methods numbered from 0 to n - 1.

You are given two integers n and k, and a 2D integer array invocations, where invocations[i] = [ai, bi] indicates that method ai invokes method bi.

There is a known bug in method k. Method k, along with any method invoked by it, either directly or indirectly, are considered suspicious and we aim to remove them.

A group of methods can only be removed if no method outside the group invokes any methods within it.

Return an array containing all the remaining methods after removing all the suspicious methods. You may return the answer in any order. If it is not possible to remove all the suspicious methods, none should be removed.








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
        #  Date        : 2026-08-25                                             #
        #                                                                       #
        #########################################################################
        */
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer> ans = new ArrayList<>();
        boolean[] uninfected = new boolean[n];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) 
            graph.add(new ArrayList<>());
        for (int[] i: invocations)
            graph.get(i[0]).add(i[1]);
        boolean b = false;
        HashSet<Integer> sec_con = new HashSet<>();
        bfs(graph, uninfected, sec_con, k);
        for (int i = 0; i < n; i++) {
            if (!uninfected[i]) {
                for (int j : graph.get(i)) {
                    if (sec_con.contains(j)) {
                        b = true;
                        break;
                    }
                }
            }
        }
        if (b) {
            for (int i = 0; i < n; i++)
                ans.add(i);
            return ans;
        }
        for (int i = 0; i < n; i++)
            if (!uninfected[i])
                ans.add(i);
        return ans;
    }
    public void bfs(List<List<Integer>> graph, boolean[] uninfected, HashSet<Integer> sec_con, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(k);
        uninfected[k] = true;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            sec_con.add(curr);
            for (int i : graph.get(curr)) {
                if (!uninfected[i]) {
                    uninfected[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
}
