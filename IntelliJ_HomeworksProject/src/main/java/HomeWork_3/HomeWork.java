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

        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(-7);
        numbers.add(-16);

        removeEvenNumber(numbers);
        System.out.println(numbers); // [23, -7]
    }

    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            try {
                if (next % 2 == 0) {
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
