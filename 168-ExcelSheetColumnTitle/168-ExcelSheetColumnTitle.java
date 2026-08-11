// Last updated: 8/11/2026, 4:10:50 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            ans.append((char)('A'+columnNumber % 26));
            columnNumber /=26;
        }
        return
        ans.reverse().toString();
        
    }
}