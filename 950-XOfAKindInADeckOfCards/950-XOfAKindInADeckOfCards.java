// Last updated: 8/11/2026, 4:06:18 PM
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int card : deck) {
            freq.put(card, freq.getOrDefault(card, 0) + 1);
        }

        int gcd = 0;
        for (int count : freq.values()) {
            gcd = findGCD(gcd, count);
        }

        return gcd >= 2;
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}