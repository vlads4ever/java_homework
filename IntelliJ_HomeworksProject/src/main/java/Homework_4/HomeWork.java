package Homework_4;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String userInput;

        while (!(userInput = sc.nextLine()).equals("exit")) {
            if (userInput.equals("print")) {
                // TODO: выводим все предыдущие строки в обратном порядке
                if (list.size() == 0) {
                    System.out.println("Список пуст.");
                } else {
                    // Вариант с конвертацией списка в очередь
//                    Deque<String> deque = new ArrayDeque<>(list);
//                    while (deque.peekLast() != null) {
//                        System.out.print(deque.removeLast() + " ");
//                    }

                    // Вариант с использованием обратного итерирования в ListIterator
                    ListIterator<String> lIt = list.listIterator(list.size());
                    while (lIt.hasPrevious()) {
                        System.out.println(lIt.previous() + " ");
                    }
                    System.out.println();
                }
            } else if (userInput.equals("revert")) {
                // TODO: удаляем последнюю введеную строку
                try {
                    list.remove(list.size() - 1);
                    System.out.println("Последний элемент удален.");
                } catch (IndexOutOfBoundsException  a) {
                    System.out.println("Список пуст.");
                }
            } else {
                // TODO: вносим строку в список
                list.add(userInput);
            }
        }
        sc.close();
    }
}

// Реализовать приложение, которое:
// Принимает от пользователя и запоминает строки
// Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
// Если введено revert, то удаляем последнюю введеную строку
// Если введено exit, то завершаем программу
// > java
// > c++
// > python
// > c#
// > print
// < [c#, python, c++, java]
// > revert
// > print
// < [python, c++, java]
// > exit
