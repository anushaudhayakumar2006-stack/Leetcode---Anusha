// Last updated: 8/11/2026, 4:06:53 PM
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double left = 0.0, right = 1.0;

        while (true) {
            double mid = (left + right) / 2;

            int count = 0;
            int numerator = 0, denominator = 1;
            int j = 1;

            for (int i = 0; i < n - 1; i++) {
                while (j < n && arr[i] > mid * arr[j]) {
                    j++;
                }

                if (j == n) break;

                count += (n - j);

                if ((long) arr[i] * denominator > (long) numerator * arr[j]) {
                    numerator = arr[i];
                    denominator = arr[j];
                }
            }

            if (count == k) {
                return new int[]{numerator, denominator};
            } else if (count < k) {
                left = mid;
            } else {
                right = mid;
            }
        }
    }
}
