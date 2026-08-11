// Last updated: 8/11/2026, 4:06:45 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        return (s + s).contains(goal);
    }
}