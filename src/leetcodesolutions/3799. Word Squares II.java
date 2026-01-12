// You are given a string array words, consisting of distinct 4-letter strings, each containing lowercase English letters.

// A word square consists of 4 distinct words: top, left, right and bottom, arranged as follows:

// top forms the top row.
// bottom forms the bottom row.
// left forms the left column (top to bottom).
// right forms the right column (top to bottom).
// It must satisfy:

// top[0] == left[0], top[3] == right[0]
// bottom[0] == left[3], bottom[3] == right[3]
// Return all valid distinct word squares, sorted in ascending lexicographic order by the 4-tuple (top, left, right, bottom)​​​​​​​.



--------------------------------------------SOLUTION--------------------------------------------



class Solution {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words.length; j++)
                for (int k = 0; k < words.length; k++)
                    for (int l = 0; l < words.length; l++)
                        if (i != j && i != k && i != l && j != k && j != l && k != l) {
                            if (words[i].charAt(0) == words[j].charAt(0) && words[i].charAt(3) == words[k].charAt(0) && words[l].charAt(0) == words[j].charAt(3) && words[l].charAt(3) == words[k].charAt(3)) {
                                List<String> p = new ArrayList<>();
                                p.add(words[i]);
                                p.add(words[j]);
                                p.add(words[k]);
                                p.add(words[l]);
                                ans.add(p);
                            }
                        }
        
        ans.sort(
        Comparator.comparing((List<String> a) -> a.get(0))
              .thenComparing(a -> a.get(1))
              .thenComparing(a -> a.get(2))
              .thenComparing(a -> a.get(3))
        );
        return ans;
    }
}
