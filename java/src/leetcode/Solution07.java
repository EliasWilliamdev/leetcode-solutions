package leetcode;
//Valid Parentheses: Verifique se uma string de parênteses é válida.
import java.util.Stack;

public class Solution07 {
    public static void main(String[] args) {
        Solution07 solution = new Solution07();
        String input = "{[()]}";  // Exemplo de entrada
        boolean result = solution.isValid(input);
        System.out.println("A string é válida? " + result);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}