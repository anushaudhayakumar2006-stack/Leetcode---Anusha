// Last updated: 8/11/2026, 4:06:50 PM
class Solution {
    public boolean validTicTacToe(String[] b) {
        int x = 0, o = 0;
        for (String s : b)
            for (char c : s.toCharArray()) {
                if (c == 'X') x++;
                if (c == 'O') o++;
            }

        boolean wx = win(b, 'X'), wo = win(b, 'O');

        return !(o > x || x > o + 1 ||
                 (wx && wo) ||
                 (wx && x != o + 1) ||
                 (wo && x != o));
    }

    boolean win(String[] b, char c) {
        for (int i = 0; i < 3; i++)
            if ((b[i].charAt(0) == c && b[i].charAt(1) == c && b[i].charAt(2) == c) ||
                (b[0].charAt(i) == c && b[1].charAt(i) == c && b[2].charAt(i) == c))
                return true;

        return (b[0].charAt(0) == c && b[1].charAt(1) == c && b[2].charAt(2) == c) ||
               (b[0].charAt(2) == c && b[1].charAt(1) == c && b[2].charAt(0) == c);
    }
}