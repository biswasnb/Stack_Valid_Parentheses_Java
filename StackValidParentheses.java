import java.util.*;

class StackValidParentheses{

    public static boolean solve(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '{' || c == '(' || c == '[') {
                s.push(c);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                char top = s.pop();
                if ((c == '}' && top != '{') ||
                    (c == ')' && top != '(') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return s.isEmpty(); 
    }

    public static void main(String[] args) {
        String str1= "{([])(])}";
        boolean ans1 = solve(str1);
        System.out.println(ans1); 
        String str2= "{([])[]}";
        boolean ans2 = solve(str2);
        System.out.println(ans2); 
    }
}
