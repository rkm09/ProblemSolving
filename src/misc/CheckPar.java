package misc;

import java.util.Deque;
import java.util.LinkedList;

public class CheckPar {
    public static void main(String[] args) {
        boolean res = checkParentheses("{[]}");
        boolean res2 = checkParenthesesUsingDeque("{[]}");
        System.out.println(res);
        System.out.println(res2);
    }
    public static boolean checkParentheses(String in) {
        if(checkIsValid(in)) {
            while (in.contains("()") || in.contains("[]") || in.contains("{}")) {
                in = in.replaceAll("\\(\\)", "")
                        .replaceAll("\\[\\]", "")
                        .replaceAll("\\{\\}", "");
            }
        }
        return in.length() == 0;
    }
    public static boolean checkIsValid(String str) {
        if(str.length() % 2 != 0 || str == null) return false;
        char[] ch = str.toCharArray();
        for(char c : ch) {
            if(!(c == '{' || c == '}' || c == '[' || c == ']' || c == '(' || c == ')')) {
                return false;
            }
        }
        return true;
    }
    // Implementation 2 (deque)
    public static boolean checkParenthesesUsingDeque(String in) {
        char[] ch = in.toCharArray();
        Deque<Character> deque = new LinkedList<>();
        for(char c : ch) {
            if(c == '(' || c == '{' || c == '[') {
                deque.addFirst(c);
            } else {
                if(!deque.isEmpty() && ((deque.peekFirst() == '{' && c == '}') ||
                        (deque.peekFirst() == '[' && c == ']') ||
                        (deque.peekFirst() == '(' && c == ')') )) {
                    deque.removeFirst();
                } else {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
