// Last updated: 8/11/2026, 4:10:46 PM
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for(int num : nums){
            if(count == 0)
            candidate = num;
            count += (num == candidate)? 1 : -1;
        }
        return candidate;
        
    }
}