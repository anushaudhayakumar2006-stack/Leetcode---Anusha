// Last updated: 8/11/2026, 4:09:01 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;  

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                j++;
            }
        }
    }
}
