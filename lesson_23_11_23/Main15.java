

/*
Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            String line = scanner.nextLine();
            switch (line){
                case "print":
//                    ListIterator<String> iterator = list.listIterator(list.size());
//                    while (iterator.hasPrevious()){
//                        System.out.println(iterator.previous());
//                    }
                    for (String word: list){
                        System.out.println(word);
                    }
                    break;
                case "revert":
                    list.removeFirst();
                    break;
                case "q":
                    work = false;
                    break;
                default:
                    list.addFirst(line);
            }
        }
    }
}