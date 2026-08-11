// Last updated: 8/11/2026, 4:12:15 PM
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for (int num : count) {
                key.append('#').append(num);
            }

            map.computeIfAbsent(key.toString(), k -> new ArrayList<>())
               .add(s);
        }

        return new ArrayList<>(map.values());
    }
}