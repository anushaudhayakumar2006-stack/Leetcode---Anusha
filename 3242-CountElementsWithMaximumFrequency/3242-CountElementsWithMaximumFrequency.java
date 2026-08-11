// Last updated: 8/11/2026, 4:03:25 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[]f=new int[101];
        int max=0,ans=0;
        for(int n:nums){
            f[n]++;
            max=Math.max(max,f[n]);
        }        
        for(int x:f)
        if(x==max)ans+=x;
        return ans;
    
    }
}