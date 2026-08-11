// Last updated: 8/11/2026, 4:10:07 PM
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n!=0){
            n = n&n-1;
            c++;
        }
        return c;
    }

        
    }
