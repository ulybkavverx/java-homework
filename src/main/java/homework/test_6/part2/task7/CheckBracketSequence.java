package homework.test_6.part2.task7;

import java.util.ArrayDeque;

public class CheckBracketSequence {
    private ArrayDeque<Character> stack;

    public CheckBracketSequence() {this.stack = new ArrayDeque<>();}

    // проверка валидности скобок
    public boolean isValid(String str) {
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char last = stack.pop();

                if (
                        (ch == ')' && last != '(') ||
                                (ch == '}' && last != '{') ||
                                (ch == ']' && last != '[')
                ) return false;
            }
        }
        return stack.isEmpty();
    }

    public void printAllStack() {
        System.out.println("Все элементы" + stack);
    }
}
