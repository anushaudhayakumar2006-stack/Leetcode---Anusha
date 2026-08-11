// Last updated: 8/11/2026, 4:04:13 PM
class Solution {
    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0; 
        } else if (n % 2 == 0) {
            return n / 2;
        } else {
            return n;
        }
    }
}
        