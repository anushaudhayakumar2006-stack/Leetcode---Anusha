// Last updated: 8/11/2026, 4:06:40 PM
import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        buildStack(s, stack1);
        buildStack(t, stack2);

        return stack1.equals(stack2);
    }

    private void buildStack(String str, Stack<Character> stack) {
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
    }
}