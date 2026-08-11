// Last updated: 8/11/2026, 4:12:10 PM
class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            n = -n;
            x = 1 / x;
        } 
        double pow = 1;
        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            }
            x *=x;
            n >>>= 1;
        }
        return pow;
        
    }
}