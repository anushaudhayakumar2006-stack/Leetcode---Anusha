// Last updated: 8/11/2026, 4:06:02 PM
class Solution {
    public int fib(int n) {
        if (n < 2) return n;

        int a = 0;  
        int b = 1;  

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}

       