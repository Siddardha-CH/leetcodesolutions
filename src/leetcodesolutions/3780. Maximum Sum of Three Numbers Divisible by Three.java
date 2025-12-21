// You are given an integer array nums.

// Your task is to choose exactly three integers from nums such that their sum is divisible by three.

// Return the maximum possible sum of such a triplet. If no such triplet exists, return 0.





___________________________________________SOLUTION________________________________________



  class Solution {
    public int maximumSum(int[] nums) {
        int ans = 0;
        ArrayList<Integer> o = new ArrayList<>();
        ArrayList<Integer> z = new ArrayList<>();
        ArrayList<Integer> t = new ArrayList<>();
        for (int i : nums)
            if (i % 3 ==  0)
                z.add(i);
            else if (i % 3 == 1)
                o.add(i);
            else
                t.add(i);
        Collections.sort(o);
        Collections.sort(z);
        Collections.sort(t);
        ArrayList<Integer> p = new ArrayList<>();
        if (o.size() > 2)
            for (int i = o.size() - 1; i >= o.size() - 3; i--)
                p.add(o.get(i));
        else
            for (int i = 0; i < o.size(); i++)
                p.add(o.get(i));
        if (z.size() > 2)
            for (int i = z.size() - 1; i >= z.size() - 3; i--)
                p.add(z.get(i));
        else
            for (int i = 0; i < z.size(); i++)
                p.add(z.get(i));
        if (t.size() > 2)
            for (int i = t.size() - 1; i >= t.size() - 3; i--)
                p.add(t.get(i));
        else
            for (int i = 0; i < t.size(); i++)
                p.add(t.get(i));
        for (int i = 0; i < p.size() - 2; i++)
            for (int j = i + 1; j < p.size() - 1; j++)
                for (int k = j + 1; k < p.size(); k++)
                    if ((p.get(i) + p.get(j) + p.get(k)) % 3 == 0)
                        ans = Math.max(ans,p.get(i) + p.get(j) + p.get(k));
        return ans;
    }
}
