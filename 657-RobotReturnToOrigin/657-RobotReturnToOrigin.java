// Last updated: 8/11/2026, 4:07:25 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char m : moves.toCharArray()) {
            if (m == 'R') x++;
            else if (m == 'L') x--;
            else if (m == 'U') y++;
            else if (m == 'D') y--;
        }
        return x == 0 && y == 0;
    }
}