package HomeWork_1;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        System.out.println("isSumBetween10And20: 5, 15");
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println("isSumBetween10And20: 7, 15");
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println("isSumBetween10And20: 2, 6");
        System.out.println(isSumBetween10And20(2, 6)); // false
        System.out.println("====================================");

        System.out.println("isPositive: 5");
        System.out.println(isPositive(5)); // true
        System.out.println("isPositive: -3");
        System.out.println(isPositive(-3)); // false
        System.out.println("====================================");

        System.out.println("Repeat 'abcd' 5 times");
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println("====================================");

        System.out.println("isLeapYear(2020)");
        System.out.println(isLeapYear(2020));
        System.out.println("isLeapYear(2023)");
        System.out.println(isLeapYear(2023));
        System.out.println("====================================");

        int[] arr = createArray(5, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println("====================================");

        System.out.println("Invert array");
        int[] arr01 = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr01));
        changeIntArray(arr01);
        System.out.println(Arrays.toString(arr01));
        System.out.println("====================================");

        System.out.println("If number < 6 then number * 2");
        int[] arr02 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr02));
        transformationArray(arr02);
        System.out.println(Arrays.toString(arr02));
        System.out.println("====================================");

        printTwoMatrix(4);
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        int sumAB = a + b;
        return sumAB >= 10 && sumAB <= 20;
    }

    private static boolean isPositive(int x) {
        return x > 0;
    }

    private static void printString(String source, int repeat) {
        System.out.println(source.repeat(repeat));
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        boolean result;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) result = true;
        else{
            result = false;
        }
        return result;
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) arr[i] = initialValue;
        return arr;
    }

    private static void changeIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
    }

    private static void transformationArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? arr[i] * 2 : arr[i];
        }
    }

    private static void printTwoMatrix(int count){
        int[][] matrixMain = new int[count][count];
        int[][] matrixSide = new int[count][count];
        for (int i = 0; i < count; i++) {
            matrixMain[i][i] = 1;
            matrixSide[i][count - 1 - i] = 1;
        }
        for (int i = 0; i < count; i++) System.out.println(Arrays.toString(matrixMain[i]));
        System.out.println("*******");
        for (int i = 0; i < count; i++) System.out.println(Arrays.toString(matrixSide[i]));
    }



    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     *
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     *
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */
}
