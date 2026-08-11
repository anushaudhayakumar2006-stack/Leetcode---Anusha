// Last updated: 8/11/2026, 4:09:14 PM
class Solution {
    public int addDigits(int num) {
        int n = num;
        int sum;  
        while(n > 9){
            sum = 0;
            while(n != 0){
                int d = n % 10;
                sum += d;
                n /=10;
            }
            n = sum;
        }
        return n;

        }
        
    }
