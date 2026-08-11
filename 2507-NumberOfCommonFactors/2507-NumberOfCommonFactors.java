// Last updated: 8/11/2026, 4:04:17 PM
class Solution {
    public int commonFactors(int a, int b) {
        int gcd = gcd(a, b);
        int count = 0;

        for (int i = 1; i * i <= gcd; i++) {
            if (gcd % i == 0) {
                count++;               
                if (i != gcd / i) {
                    count++;           
                }
            }
        }
        return count;
    }

    private int gcd(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}
