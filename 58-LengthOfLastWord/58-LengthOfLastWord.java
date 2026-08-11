// Last updated: 8/11/2026, 4:12:03 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                len++;
            else if (len > 0)
                break;
        }
        return len;
    }
}
