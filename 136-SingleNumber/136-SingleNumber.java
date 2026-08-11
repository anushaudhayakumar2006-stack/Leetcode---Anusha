// Last updated: 8/11/2026, 4:11:11 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  
        }
        return result;
    }
}
