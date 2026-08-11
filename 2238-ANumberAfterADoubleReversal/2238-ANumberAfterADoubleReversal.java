// Last updated: 8/11/2026, 4:04:27 PM
class Solution {
    private int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public boolean isSameAfterReversals(int num) {
        int reversed1 = reverse(num);
        int reversed2 = reverse(reversed1);
        return reversed2 == num;
    }
}
