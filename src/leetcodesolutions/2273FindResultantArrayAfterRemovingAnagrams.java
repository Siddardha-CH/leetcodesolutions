// You are given a 0-indexed string array words, where words[i] consists of lowercase English letters.

// In one operation, select any index i such that 0 < i < words.length and words[i - 1] and words[i] are anagrams, 
//   and delete words[i] from words. Keep performing this operation as long as you can select an index that satisfies the conditions.

// Return words after performing all operations. It can be shown that selecting the indices for each operation in
//   any arbitrary order will lead to the same result.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase using all the 
//   original letters exactly once. For example, "dacb" is an anagram of "abdc".



  --------------------------------------------------------SOL-1----------------------------------------------------------------

import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans= new ArrayList<>();
        if(words.length==0) return ans;
        ans.add(words[0]);
        for(int i=1;i<words.length;i++){
            String k1=ans.get(ans.size()-1);
            String k2=words[i];
            if(!isAnagram(k1,k2)) ans.add(k2);
        }
        return ans;
    }
    private boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int q=0;q<s1.length();q++){
            char k=s1.charAt(q);
            map1.put(k,map1.getOrDefault(k,0)+1);
            k=s2.charAt(q);
            map2.put(k,map2.getOrDefault(k,0)+1);
        }
        return map1.equals(map2);
    }
}


-----------------------------------------SOL-2---------------------------------------------


  class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        String k = sort(words[0]);
        for (int i  = 1; i < words.length; i++) {
            String n = sort(words[i]);
            if (!n.equals(k)) {
                ans.add(words[i]);
                k = n;
            }
        } 
        return ans;
    }
    String sort(String s) {
        char[] k = s.toCharArray();
        Arrays.sort(k);
        return new String(k);
    }
}





