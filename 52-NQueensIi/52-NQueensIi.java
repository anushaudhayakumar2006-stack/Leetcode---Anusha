// Last updated: 8/11/2026, 4:12:06 PM
class Solution {
    int ans = 0;

    public int totalNQueens(int n) {
        solve(0, n, new boolean[n], new boolean[2*n], new boolean[2*n]);
        return ans;
    }

    void solve(int r, int n, boolean[] c, boolean[] d1, boolean[] d2) {
        if (r == n) { ans++; return; }

        for (int i = 0; i < n; i++) {
            if (!c[i] && !d1[r-i+n] && !d2[r+i]) {
                c[i] = d1[r-i+n] = d2[r+i] = true;
                solve(r + 1, n, c, d1, d2);
                c[i] = d1[r-i+n] = d2[r+i] = false;
            }
        }
    }
}