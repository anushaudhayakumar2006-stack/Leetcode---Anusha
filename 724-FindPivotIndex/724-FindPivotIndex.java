// Last updated: 8/11/2026, 4:07:14 PM
class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;
        for (int value : nums) {
            totalSum += value;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}