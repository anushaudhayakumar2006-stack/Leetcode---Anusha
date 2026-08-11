// Last updated: 8/11/2026, 4:09:25 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }else{
            return(n&(n-1))==0;
        }
        }
}
        
    