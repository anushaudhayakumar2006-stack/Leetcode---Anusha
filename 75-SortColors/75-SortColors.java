// Last updated: 8/11/2026, 4:11:41 PM
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
         while (mid <= high) {
            switch (nums[mid]) {
                case 0: // Red
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1: // White
                    mid++;
                    break;
                 case 2: // Blue
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        obj.sortColors(nums);
        for (int n : nums) System.out.print(n + " ");
    }
}
