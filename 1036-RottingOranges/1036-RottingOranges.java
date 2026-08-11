// Last updated: 8/11/2026, 4:05:57 PM
class Solution {
    public int orangesRotting(int[][] g) {
        java.util.Queue<int[]> q = new java.util.LinkedList<>();
        int f = 0, t = 0, d[][] = {{1,0},{-1,0},{0,1},{0,-1}};

        for (int i = 0; i < g.length; i++)
            for (int j = 0; j < g[0].length; j++)
                if (g[i][j] == 2) q.offer(new int[]{i,j});
                else if (g[i][j] == 1) f++;

        while (!q.isEmpty() && f > 0) {
            for (int s = q.size(); s > 0; s--) {
                int[] p = q.poll();
                for (int[] x : d) {
                    int r = p[0] + x[0], c = p[1] + x[1];
                    if (r>=0 && c>=0 && r<g.length && c<g[0].length && g[r][c]==1) {
                        g[r][c] = 2;
                        f--;
                        q.offer(new int[]{r,c});
                    }
                }
            }
            t++;
        }
        return f == 0 ? t : -1;
    }
}