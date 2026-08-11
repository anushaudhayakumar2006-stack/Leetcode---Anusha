// Last updated: 8/11/2026, 4:11:49 PM
class Solution {
    public List<String> fullJustify(String[] w, int max) {
        List<String> res = new ArrayList<>();
        for (int i = 0, j; i < w.length; i = j) {
            int len = w[i].length();
            for (j = i + 1; j < w.length && len + 1 + w[j].length() <= max; j++)
                len += 1 + w[j].length();

            StringBuilder sb = new StringBuilder();
            int gaps = j - i - 1;

            if (j == w.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    sb.append(w[k]);
                    if (k < j - 1) sb.append(" ");
                }
                while (sb.length() < max) sb.append(" ");
            } else {
                int words = 0;
                for (int k = i; k < j; k++) words += w[k].length();
                int spaces = max - words, even = spaces / gaps, extra = spaces % gaps;
                for (int k = i; k < j; k++) {
                    sb.append(w[k]);
                    if (k < j - 1)
                        for (int s = 0; s < even + (k - i < extra ? 1 : 0); s++) sb.append(" ");
                }
            }
            res.add(sb.toString());
        }
        return res;
    }
}