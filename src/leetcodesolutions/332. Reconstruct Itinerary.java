You are given a list of airline tickets where tickets[i] = [fromi, toi] represent the departure and the arrival airports of one flight. Reconstruct the itinerary in order and return it.

All of the tickets belong to a man who departs from "JFK", thus, the itinerary must begin with "JFK". If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string.

For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
You may assume all tickets form at least one valid itinerary. You must use all the tickets once and only once.






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
        #  Date        : 2026-19-10                                             #
        #                                                                       #
        #########################################################################
        */
    List<String> ans;
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        for (List<String> i : tickets) {
            if (!map.containsKey(i.get(0)))
                map.put(i.get(0), new PriorityQueue<>());
            map.get(i.get(0)).add(i.get(1));
        }
        ans = new ArrayList<>();
        func(map, "JFK");
        Collections.reverse(ans);
        return ans;
    }
    public void func(Map<String, PriorityQueue<String>> map, String curr) {
        PriorityQueue<String> k = map.get(curr);
        while (k != null && !k.isEmpty()) {
            String s = k.poll();
            func(map, s);
        }
        ans.add(curr);
    }
}
