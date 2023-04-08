package HomeWork_5;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true
    }

    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    static boolean isCorrectParentheses(String parentheses) {
        // TODO: 07.04.2023 Вписать решение!
        // Нужно завести маппинг скобочек либо ( -> ), либо ) -> ( и так для каждой пары
        // Нужно использовать Deque.
        // Открывающуюся скобку вносим в Deque (insertFirst)
        // Если встретилась закрывающаяся скобка, то (Deque#pollFirst) и сравниваем ее с встретившейся

        Map<Character,Character> parDict = new HashMap<>(3);
        parDict.put(')', '(');
        parDict.put(']', '[');
        parDict.put('}', '{');
        parDict.put('>', '<');

        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = parentheses.toCharArray();
        for (char item: chars) {
            if (!parDict.containsKey(item)) {
                deque.addLast(item);
            } else {
                if (parDict.get(item) != deque.pollLast()) return false;
            }
        }
        return deque.size() == 0;
    }
}
