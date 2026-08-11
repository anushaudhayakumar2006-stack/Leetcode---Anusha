// Last updated: 8/11/2026, 4:04:20 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;   
        } else {
            return 2 * n; 
        }
    }
}