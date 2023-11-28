

//заполнить список десятью случайными числами.
//отсортировать список методом sort() и вывести на экран.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main9 {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> list = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        
        //list.sort(null); // прямой порядок
        list.sort(Comparator.naturalOrder()); //прямой порядок
        //list.sort(Comparator.reverseOrder()); //обратный порядок
        System.out.println(list);
    }
}