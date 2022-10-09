class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int score;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(0);
            } else {
                score = stack.peek() == 0 ? 1 : 2 * stack.pop();
                stack.pop();
                stack.push(stack.peek() == 0 ? score : score + stack.pop());
            }
        }
        return stack.peek();
    }
}