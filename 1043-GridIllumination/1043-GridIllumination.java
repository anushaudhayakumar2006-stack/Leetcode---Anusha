// Last updated: 8/11/2026, 4:05:53 PM
import java.util.*;

class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> diag = new HashMap<>();
        Map<Integer, Integer> anti = new HashMap<>();
        Set<Long> on = new HashSet<>();

        for (int[] l : lamps) {
            int r = l[0], c = l[1];
            long key = ((long) r << 32) | c;
            if (!on.add(key)) continue;

            row.put(r, row.getOrDefault(r, 0) + 1);
            col.put(c, col.getOrDefault(c, 0) + 1);
            diag.put(r - c, diag.getOrDefault(r - c, 0) + 1);
            anti.put(r + c, anti.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];
        int[][] d = {{0,0},{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};

        for (int i = 0; i < queries.length; i++) {
            int r = queries[i][0], c = queries[i][1];

            ans[i] = (row.containsKey(r) || col.containsKey(c) ||
                     diag.containsKey(r - c) || anti.containsKey(r + c)) ? 1 : 0;

            for (int[] x : d) {
                int nr = r + x[0], nc = c + x[1];
                long key = ((long) nr << 32) | nc;

                if (on.remove(key)) {
                    row.put(nr, row.get(nr) - 1);
                    if (row.get(nr) == 0) row.remove(nr);

                    col.put(nc, col.get(nc) - 1);
                    if (col.get(nc) == 0) col.remove(nc);

                    diag.put(nr - nc, diag.get(nr - nc) - 1);
                    if (diag.get(nr - nc) == 0) diag.remove(nr - nc);

                    anti.put(nr + nc, anti.get(nr + nc) - 1);
                    if (anti.get(nr + nc) == 0) anti.remove(nr + nc);
                }
            }
        }
        return ans;
    }
}