// Last updated: 8/11/2026, 4:09:09 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int a = 0;
        for(int i = 0; i< n ; i++){
            sum += nums[i];
        }
        for(int i = 0; i < n; i++){
            a = n * (n+1)/2;
            
        }
        return (a-sum);
    }
}