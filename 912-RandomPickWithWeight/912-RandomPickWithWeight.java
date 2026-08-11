// Last updated: 8/11/2026, 4:06:26 PM
class Solution {
    int[] pre;
    int sum = 0;

    public Solution(int[] w) {
        pre = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
            pre[i] = sum;
        }
    }

    public int pickIndex() {
        int target = (int)(Math.random() * sum) + 1;
        int l = 0, r = pre.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (pre[m] < target) l = m + 1;
            else r = m;
        }
        return l;
    }
}