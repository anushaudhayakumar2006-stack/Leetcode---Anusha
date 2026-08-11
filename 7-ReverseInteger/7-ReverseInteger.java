// Last updated: 8/11/2026, 4:12:53 PM
class Solution {
    public int reverse(int x) {
        long rev = 0;   
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
        }
        
        return (int) rev;
    }
}

