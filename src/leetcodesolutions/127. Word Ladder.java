A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:

Every adjacent pair of words differs by a single letter.
Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
sk == endWord
Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.






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
        #  Date        : 2026-17-10                                             #
        #                                                                       #
        #########################################################################
        */
    public int ladderLength(String start, String end, List<String> words) {
        Map<String, List<String>> map = new HashMap<>();
        if (!words.contains(end)) // no possibility
            return 0;
        words.add(start);
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String pattern = word.substring(0, i) + "*" + word.substring(i + 1);
                if (!map.containsKey(pattern))
                    map.put(pattern, new ArrayList<>());
                map.get(pattern).add(word);
            }
        }
        int ans = 1;
        Set<String> seen = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(start);
        seen.add(start);
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                String word = q.poll();
                if (word.equals(end))
                    return ans;
                for (int j = 0; j < word.length(); j++) {
                    String pattern = word.substring(0, j) + "*" + word.substring(j + 1);
                    if (map.containsKey(pattern))
                        for (String w : map.get(pattern)) {
                            if (!seen.contains(w)) {
                                q.offer(w);
                                seen.add(w);
                            }
                        }
                }
            }
            ans += 1;
        }
        return 0;
    }
}
