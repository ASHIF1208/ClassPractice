import java.util.Stack;
class Leetcode020{
        public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        System.out.println("Input: " + s1 + ", Output: " + isValid(s1));
        System.out.println("Input: " + s2 + ", Output: " + isValid(s2));
        System.out.println("Input: " + s3 + ", Output: " + isValid(s3));
    }
}