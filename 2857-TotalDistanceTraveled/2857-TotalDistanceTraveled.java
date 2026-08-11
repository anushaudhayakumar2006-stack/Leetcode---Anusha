// Last updated: 8/11/2026, 4:03:42 PM
class Solution {
   public int distanceTraveled(int mainTank, int additionalTank) {

    int distance = 0;

    while (mainTank > 0) {
        if (mainTank >= 5) {
            mainTank -= 5;
            distance += 50;

            if (additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        } else {
            distance += mainTank * 10;
            break;
        }
    }
    return distance;
}


}