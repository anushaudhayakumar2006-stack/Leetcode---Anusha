// Last updated: 8/11/2026, 4:05:00 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
        if(i != j && arr[i] == 2 * arr[j])
        return true;
        return false;
        
    }
}