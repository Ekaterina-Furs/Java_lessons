

/*
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на
позицию num.
3. Если введено print~num, выводит строку из позиции num в связном
списке и удаляет её из списка.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку");
            String line = scanner.nextLine();
            if (line.equals("q")){
                break;
            }
            String[] arr = line.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            switch (text){
                case "print":
                    System.out.println(list.removeLast());
                    break;
                default:
                    list.add(num, text);
            }
        }
    }
}