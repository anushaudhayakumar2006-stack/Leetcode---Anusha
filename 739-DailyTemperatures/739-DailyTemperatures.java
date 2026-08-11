// Last updated: 8/11/2026, 4:07:09 PM
import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return result;
    }
}