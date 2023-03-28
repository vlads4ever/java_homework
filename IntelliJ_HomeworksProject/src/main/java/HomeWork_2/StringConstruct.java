package HomeWork_2;

public class StringConstruct {
    public static void main(String[] args) {
        String resString = buildString(6, 'a', 'b');
        String resString2 = buildString(7, 'x', 'y');
        System.out.println(resString);
        System.out.println(resString2);
    }


    /**
     * Дано четное число N (>0) и символы c1 и c2.
     * Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
     *
     * (n = 6, c1='a', c2='b') -> "ababab"
     * (n = 8, c1='x', c2='y') -> "xyxyxyxy"
     */
    static String buildString(int n, char c1, char c2) {
        String result = "" + c1 + c2;
        if (n % 2 == 0){
            result = result.repeat(n / 2);
        } else {
            result = result.repeat(n / 2) + c1;
        }

        return result;
    }
}
