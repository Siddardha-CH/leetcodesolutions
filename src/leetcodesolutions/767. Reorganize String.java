Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

Return any possible rearrangement of s or return "" if not possible.





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
        #  Date        : 2026-03-09                                             #
        #                                                                       #
        #########################################################################
        */
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) 
            map.put(c, map.getOrDefault(c, 0) + 1);
        StringBuilder sb = new StringBuilder();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for (Map.Entry<Character, Integer> entry : map.entrySet())
            pq.offer(new int[]{entry.getValue(), entry.getKey() - 'a'});
        while (pq.size() > 1) {
            int[] high = pq.poll();
            int[] sec = pq.poll();
            sb.append((char)(high[1] + 'a'));
            sb.append((char)(sec[1] + 'a'));
            high[0] -= 1;
            sec[0] -= 1;
            if (high[0] > 0)
                pq.offer(high);
            if (sec[0] > 0)
                pq.offer(sec);
        }
        if (pq.size() == 1) {
            int[] k = pq.poll();
            sb.append((char)(k[1] + 'a'));
            k[0] -= 1;
            if (k[0] > 0)
                pq.offer(k);
        }
        if (!pq.isEmpty())
            return "";
        return sb.toString();
    }
}
