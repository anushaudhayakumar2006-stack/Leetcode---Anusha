// Last updated: 8/11/2026, 4:07:17 PM
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        
        HashSet<String> builtWords = new HashSet<>();
        String longestWord = "";

        for (String word : words) {
            if (word.length() == 1 || builtWords.contains(word.substring(0, word.length() - 1))) {
                builtWords.add(word);
                
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }

        return longestWord;
    }
}