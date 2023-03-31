package HomeWork_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");

//        removeIntegers(strings);
//        System.out.println(strings); // [string, my_string]

        removeEvenNumber(strings);
        System.out.println(strings); // [string, -5, my_string]
    }

    static void removeEvenNumber(List<String> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        Iterator<String> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            try {
                int number = Integer.parseInt(next);
                if (number % 2 == 0) {
                    iterator.remove();
                }
            } catch (NumberFormatException e) {
                // Не является целым числом - оставляем.
            }
        }
    }

    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            try {
                Integer.parseInt(next);
                iterator.remove();
            } catch (NumberFormatException e) {
                // Не является целым числом - оставляем.
            }
        }
    }
}
