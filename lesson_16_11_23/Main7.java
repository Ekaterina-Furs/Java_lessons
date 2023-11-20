/*
Напишите метод, который принимает на вход строку (String)
и определяет, является ли строка палиндромом (возвращает boolean значение).

Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
 */
public class Main7 {
    public static void main(String[] args) {
        String s = "А роза упала на лапу Азора";
        System.out.println(isPolindromeV1(s));
        System.out.println(isPolindromeV2(s));
    }

    static boolean isPolindromeV1(String s){
        s = s.toLowerCase();
        s = s.replace(" ", "");
        char[] arr = s.toCharArray();
        for (int i = 0, j = arr.length-1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]){
                return false;
            }
        }
        return true;
    }

    static boolean isPolindromeV2(String s){
        s = s.toLowerCase();
        s = s.replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(s);
    }
}
