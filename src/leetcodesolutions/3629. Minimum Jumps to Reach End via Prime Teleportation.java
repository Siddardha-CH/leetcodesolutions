You are given an integer array nums of length n.

You start at index 0, and your goal is to reach index n - 1.

From any index i, you may perform one of the following operations:

Adjacent Step: Jump to index i + 1 or i - 1, if the index is within bounds.
Prime Teleportation: If nums[i] is a prime number p, you may instantly jump to any index j != i such that nums[j] % p == 0.
Return the minimum number of jumps required to reach index n - 1.



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
        #  Date        : 2026-05-08                                             #
        #                                                                       #
        #########################################################################
        */
    public int minJumps(int[] nums) {
        int n = nums.length;
        int ans = 0;

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> k = new ArrayList<>();
            int num = nums[i];
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    k.add(j);

                    while (num % j == 0)
                        num /= j;
                }
            }
            if (num > 1)
                k.add(num);

            for (int j : k) {
                if (map.containsKey(j))
                    map.get(j).add(i);
                else {
                    ArrayList<Integer> p = new ArrayList<>();
                    p.add(i);
                    map.put(j, p);
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] b = new boolean[n];
        q.offer(0);
        b[0] = true;

        while (!q.isEmpty()) {
            int s = q.size();

            while (s-- > 0) {
                int ci = q.poll();

                if (ci == n - 1)
                    return ans;

                addin(ci - 1, b, q, n);
                addin(ci + 1, b, q, n);

                int v = nums[ci];

                if (isp(v)) {
                    ArrayList<Integer> k = map.get(v);
                    if (k != null)
                        for (int i : k) {
                            if (!b[i]) {
                                b[i] = true;
                                q.offer(i);
                            }
                        }
                    map.remove(v);
                }
            }
            ans += 1;
        }
        return -1;
    }
    public void addin(int i , boolean[] b, Queue<Integer> q, int n) {
        if (i < 0 || i >= n)
            return;
        if (b[i])
            return;
        b[i] = true;
        q.offer(i);
    }
    public boolean isp(int val) {
        if (val  < 2)
            return false;
        for (int i = 2; i * i <= val; i++)
            if(val % i == 0)
                return false;
        return true;
    }
}
