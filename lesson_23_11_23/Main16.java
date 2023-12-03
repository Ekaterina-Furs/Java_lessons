

/*
1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди. 
 */

import java.util.*;

public class Main16 {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4"};
        printAsQueue(arr);
    }

    static void printAsStack(String[] arr){
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));

//        System.out.println(stack);

//        for (String s: stack){
//            System.out.println(s);
//        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    static void printAsQueue(String[] arr){
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}