class Solution {
public boolean isValid(String s) {
        Stack<Character> brStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                brStack.push(c);
                continue;
            }
            if(brStack.isEmpty()) return false;
            if(c == ')' && brStack.peek() == '(') {
                brStack.pop();
                continue;
            }
            if(c == ']' && brStack.peek() == '[') {
                brStack.pop();
                continue;
            }
            if(c == '}' && brStack.peek() == '{') {
                brStack.pop();
                continue;
            }
            return false;
        }
        return brStack.isEmpty();
    }
}